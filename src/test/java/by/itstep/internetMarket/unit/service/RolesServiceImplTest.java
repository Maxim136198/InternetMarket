package by.itstep.internetMarket.unit.service;

import by.itstep.internetMarket.dao.entity.Roles;
import by.itstep.internetMarket.dao.repository.RolesRepository;
import by.itstep.internetMarket.service.impl.RolesServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class RolesServiceImplTest {

    @InjectMocks
    private RolesServiceImpl roleService;


    @Mock
    private RolesRepository roleRepository;

    @Test
    public void testFindAll() {
        final List<Roles> roleList = Collections.singletonList(new Roles());
        when(roleRepository.findAll()).thenReturn(roleList);
        assertEquals(roleService.findAll(), roleList);
    }

    @Test
    public void testFindById() {
        final Roles role = new Roles();
        when(roleRepository.findById(any(Long.class))).thenReturn(Optional.of(role));
        assertEquals(roleService.findById(1L), role);
    }

    @Test
    public void testSave() {
        final Roles role = new Roles();
        when(roleRepository.saveAndFlush(role)).thenReturn(role);
        assertEquals(roleService.save(role), role);
    }

    @Test
    public void testUpdate() {
        final Roles role = new Roles();
        role.setId(1L);
        when(roleRepository.findById(1L)).thenReturn(Optional.of(role));
        when(roleRepository.saveAndFlush(role)).thenReturn(role);
        assertEquals(roleService.updateRoles(role), role);
    }

    @Test
    public void testDelete() {
        final Roles role = new Roles();
        role.setId(1L);
        when(roleRepository.findById(1L)).thenReturn(Optional.of(role));
        doNothing().when(roleRepository).delete(role);
        assertDoesNotThrow(() -> roleService.delete(role));
    }

    @Test
    public void testDeleteById() {
        final Roles role = new Roles();
        role.setId(1L);
        doNothing().when(roleRepository).deleteById(any(Long.class));
        when(roleRepository.findById(1L)).thenReturn(Optional.of(role));
        assertDoesNotThrow(() -> roleService.deleteById(1L));
    }
}
