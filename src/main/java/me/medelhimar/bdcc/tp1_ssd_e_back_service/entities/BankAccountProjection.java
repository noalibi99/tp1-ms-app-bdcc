package me.medelhimar.bdcc.tp1_ssd_e_back_service.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = BankAccount.class)
public interface BankAccountProjection {
}
