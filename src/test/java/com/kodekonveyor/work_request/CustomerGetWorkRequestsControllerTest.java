package com.kodekonveyor.work_request;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import com.kodekonveyor.annotations.TestedBehaviour;
import com.kodekonveyor.annotations.TestedService;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
@RunWith(MockitoJUnitRunner.class)
@TestedBehaviour("Data access")
@TestedService("CustomerGetWorkRequestsController")

public class CustomerGetWorkRequestsControllerTest
    extends CustomerWorkRequestsControllerTestBase {

  @Test
  @DisplayName("We return the right work request list for the owner ID")
  public void testWorkRequestDetails() {
    assertEquals(
        workRequestTestData.WORK_REQUEST_LIST_DTO,
        customerGetWorkRequestsController.call(workRequestTestData.OWNER_ID)
    );
  }

  @Test
  @DisplayName("We return the right work request Id")
  public void testWorkRequestgetId() {
    assertEquals(
        workRequestTestData.WORK_REQUEST_ID,
        workRequestTestData.WORK_REQUEST_ENTITY.getId()
    );
  }

  @Test
  @DisplayName("We return the right work type")
  public void testWorkRequestgetWorkType() {
    assertEquals(
        workRequestTestData.WORK_TYPE,
        workRequestTestData.WORK_REQUEST_ENTITY.getWorkType()
    );
  }

  @Test
  @DisplayName("We return the right address")
  public void testWorkRequestgetAddress() {
    assertEquals(
        workRequestTestData.addressTestData.ADDRESS_ENTITY,
        workRequestTestData.WORK_REQUEST_ENTITY.getAddress()
    );
  }

  @Test
  @DisplayName("We return the right description")
  public void testWorkRequestgetDescription() {
    assertEquals(
        workRequestTestData.DESCRIPTION,
        workRequestTestData.WORK_REQUEST_ENTITY.getDescription()
    );
  }

}
