package me.medelhimar.bdcc.tp1_ssd_e_back_service.service;

import me.medelhimar.bdcc.tp1_ssd_e_back_service.dtos.BankAccountDTOResponse;
import me.medelhimar.bdcc.tp1_ssd_e_back_service.dtos.BankAccountRequestDTO;
import me.medelhimar.bdcc.tp1_ssd_e_back_service.entities.BankAccount;
import me.medelhimar.bdcc.tp1_ssd_e_back_service.enums.AccountType;

public interface AccountService {
    public BankAccountDTOResponse addAccount(BankAccountRequestDTO bankAccountDTO);

}
