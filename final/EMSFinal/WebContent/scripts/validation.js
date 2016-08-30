/**
 * 
 */
function validateform(){  
	                   // alert('in validation js');
	                    //console.log("in validation");
	                    
	                    
						var id = document.add.Kin_id.value; 
						var name = document.add.Name.value;
						var mail = document.add.Email_id.value;
						var phone = new String(document.add.Phone_no.value);
						var dob = document.add.Dob.value;
						var sel = document.getElementById("Department_id");
						var did = sel.value;
						var pid = document.add.Project_id.value;
						var mailcheck = new RegExp("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
						if( id < 10000 || id > 99999 ){
							//alert('in validation js');
							alert('Kin_id Must Contain 5 digits')
							return false;
							}
						
						else if(( /[^a-zA-Z0-9]/.test( name )) ) {
								alert('Name must be alphanumeric only');
									return false;
 						                    
														}
						else if( !(mailcheck.test(mail))  )
							{
							    alert('Invalid Email ID');
								return false;
							}
						
						
						else if( phone.length != 10 )
								{
								alert('Phone number must have 10-digits');
								return false;
								}
						
						else if(did == 1234)
							{
									if(pid != 4321 && pid!=3321)
										{
										alert('Projects with id 4321 & 3321 are available under Department');
											return false;
										}
							}
						else if(did == 4567)
						{
								if(pid != 7654 && pid != 6654)
									{
									alert('Projects with id 7654 & 6654 are available under Department 4567');
										return false;
									}
						}
						else if(did == 7890)
						{
								if(pid != 1987 && pid != 2987)
									{
									alert('Projects with id 1987 & 2987 are available under Department 7890');
										return false;
									}
						}
						
						
						else
							{
								return true;
							}
						/*if(/^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$/.test(dob))
							{
							alert('Phone number must have 10-digits');
							return false;
							}*/
					}


