package me.medelhimar.bdcc.tp1_ssd_e_back_service.repositories;

import me.medelhimar.bdcc.tp1_ssd_e_back_service.entities.BankAccount;
import me.medelhimar.bdcc.tp1_ssd_e_back_service.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
    List<BankAccount> findByType(AccountType type);

}
