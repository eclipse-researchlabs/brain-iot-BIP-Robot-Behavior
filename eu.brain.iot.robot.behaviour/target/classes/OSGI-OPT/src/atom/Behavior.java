package atom;

import org.lib.Command;
import port.*;

import type.*;

import task.*;

// atom definition;

@Task(time=1)
public class Behavior extends Atom { 
org.lib.Command Command = new org.lib.Command() ;
// data definition;

Type<Integer> CARTID= new Type<Integer> (0); 
Type<Integer> ROBOTID= new Type<Integer> (0); 
Type<Integer> ISREADY= new Type<Integer> (0); 
Type<Integer> REQ= new Type<Integer> (0); 
Type<Integer> RESPONSE= new Type<Integer> (0); 
Type<Integer> HASNEWTASK= new Type<Integer> (0); 
Type<Integer> HASNEWPOINT= new Type<Integer> (0); 
Type<Integer> XDATA= new Type<Integer> (0); 
Type<Integer> YDATA= new Type<Integer> (0); 
Type<Integer> ZDATA= new Type<Integer> (0); 
Type<Integer> MARKERID= new Type<Integer> (0); 
Type<Integer> CARTNOTICERESPONSE= new Type<Integer> (0); 
Type<Integer> PICKCARTRESPONSE= new Type<Integer> (0); 
Type<Integer> DOORSTATE= new Type<Integer> (0); 
Type<Integer> PLACECARTRESPONSE= new Type<Integer> (0); 
Type<Integer> PLACEDOCKINGRESPONSE= new Type<Integer> (0); 
Type<String> TEXT= new Type<String> (); 
Type<Integer> DOORRESPONSE= new Type<Integer> (0); 
public Behavior( Type<Integer> robot_id){this.robot_id=robot_id; 
start();
 }

Type<Integer> robot_id= new Type<Integer> (); 




Type<Boolean> initial =new Type<Boolean> (true);
Type<Boolean>START=new Type<Boolean> (false);
Type<Boolean>AFTERSTART=new Type<Boolean> (false);
Type<Boolean>S0=new Type<Boolean> (false);
Type<Boolean>S1=new Type<Boolean> (false);
Type<Boolean>S2=new Type<Boolean> (false);
Type<Boolean>S3=new Type<Boolean> (false);
Type<Boolean>S4=new Type<Boolean> (false);
Type<Boolean>S5=new Type<Boolean> (false);
Type<Boolean>S6=new Type<Boolean> (false);
Type<Boolean>S7=new Type<Boolean> (false);
Type<Boolean>S8=new Type<Boolean> (false);
Type<Boolean>S9=new Type<Boolean> (false);
Type<Boolean>S10=new Type<Boolean> (false);
Type<Boolean>S11=new Type<Boolean> (false);
Type<Boolean>S12=new Type<Boolean> (false);
Type<Boolean>S13=new Type<Boolean> (false);
Type<Boolean>S14=new Type<Boolean> (false);
Type<Boolean>RB_START=new Type<Boolean> (false);
Type<Boolean>RB_S0=new Type<Boolean> (false);
Type<Boolean>RB_S1=new Type<Boolean> (false);
Type<Boolean>RB_S2=new Type<Boolean> (false);
Type<Boolean>RB_S3=new Type<Boolean> (false);
Type<Boolean>RB_S4=new Type<Boolean> (false);
Type<Boolean>RB_S5=new Type<Boolean> (false);
Type<Boolean>RB_S6=new Type<Boolean> (false);
Type<Boolean>RB_S7=new Type<Boolean> (false);
Type<Boolean>RB_S8=new Type<Boolean> (false);
Type<Boolean>RB_S9=new Type<Boolean> (false);
Type<Boolean>RB_S10=new Type<Boolean> (false);
Type<Boolean>RB_S11=new Type<Boolean> (false);
Type<Boolean>RB_S12=new Type<Boolean> (false);
Type<Boolean>RB_S13=new Type<Boolean> (false);
Type<Boolean>RB_S14=new Type<Boolean> (false);
Type<Boolean>SFINAL=new Type<Boolean> (false);
Type<Boolean>S15=new Type<Boolean> (false);
Type<Boolean>S16=new Type<Boolean> (false);
Type<Boolean>S17=new Type<Boolean> (false);
Type<Boolean>S18=new Type<Boolean> (false);
Type<Boolean>S19=new Type<Boolean> (false);
Type<Boolean>S20=new Type<Boolean> (false);
Type<Boolean>S21=new Type<Boolean> (false);
Type<Boolean>S22=new Type<Boolean> (false);
Type<Boolean>S23=new Type<Boolean> (false);
Type<Boolean>S24=new Type<Boolean> (false);
Type<Boolean>S25=new Type<Boolean> (false);
Type<Boolean>S26=new Type<Boolean> (false);
Type<Boolean>S13_1=new Type<Boolean> (false);
Type<Boolean>S13_2=new Type<Boolean> (false);
Type<Boolean>S13_3=new Type<Boolean> (false);
Type<Boolean>S13_4=new Type<Boolean> (false);
Type<Boolean>S13_5=new Type<Boolean> (false);
Type<Boolean>S13_6=new Type<Boolean> (false);
Type<Boolean>S11_1=new Type<Boolean> (false);
Type<Boolean>S11_2=new Type<Boolean> (false);
Type<Boolean>S11_3=new Type<Boolean> (false);
Type<Boolean>S20_1=new Type<Boolean> (false);
Type<Boolean>S20_2=new Type<Boolean> (false);
Type<Boolean>S20_3=new Type<Boolean> (false);
public ePort p0= new ePort ( ); 
public ePort p1= new ePort ( ); 
public ePort p2= new ePort ( ); 
public ePort p3= new ePort ( ); 
public ePort p4= new ePort ( ); 
public ePort p5= new ePort ( ); 
public ePort p6= new ePort ( ); 
public ePort p7= new ePort ( ); 
public ePort p8= new ePort ( ); 
public ePort p9= new ePort ( ); 
public ePort p10= new ePort ( ); 
public ePort p11= new ePort ( ); 
public ePort p12= new ePort ( ); 
public ePort p13= new ePort ( ); 
public ePort p14= new ePort ( ); 
public ePort p15= new ePort ( ); 
public ePort p16= new ePort ( ); 
public ePort p17= new ePort ( ); 
public ePort p17_1= new ePort ( ); 
public ePort p17_2= new ePort ( ); 
public ePort p18= new ePort ( ); 
public ePort p19= new ePort ( ); 
public ePort p20= new ePort ( ); 
public ePort p21= new ePort ( ); 
public ePort p21_1= new ePort ( ); 
public ePort p21_2= new ePort ( ); 
public ePort p21_3= new ePort ( ); 
public ePort p21_4= new ePort ( ); 
public ePort p21_5= new ePort ( ); 
public ePort p21_6= new ePort ( ); 
public ePort p34_1= new ePort ( ); 
public ePort p34_2= new ePort ( ); 
public ePort p34_3= new ePort ( ); 
public ePort p34_4= new ePort ( ); 
public ePort p34_5= new ePort ( ); 
public ePort p22= new ePort ( ); 
public ePort p23= new ePort ( ); 
public ePort p24= new ePort ( ); 
public ePort p25= new ePort ( ); 
public ePort p26= new ePort ( ); 
public ePort p27= new ePort ( ); 
public ePort p28= new ePort ( ); 
public ePort p29= new ePort ( ); 
public ePort p30= new ePort ( ); 
public ePort p31= new ePort ( ); 
public ePort p32= new ePort ( ); 
public ePort p33= new ePort ( ); 
public ePort p34= new ePort ( ); 
public ePort p35= new ePort ( ); 
public ePort p36= new ePort ( ); 
public ePort p37= new ePort ( ); 
public ePort p38= new ePort ( ); 
public ePort p39= new ePort ( ); 
public ePort p40= new ePort ( ); 
public ePort p41= new ePort ( ); 
public ePort p42= new ePort ( ); 
public ePort p43= new ePort ( ); 
public ePort p44= new ePort ( ); 
public ePort p45= new ePort ( ); 
public ePort p46= new ePort ( ); 
public ePort rb_p0= new ePort ( ); 
public ePort rb_p1= new ePort ( ); 
public ePort rb_p2= new ePort ( ); 
public ePort rb_p3= new ePort ( ); 
public ePort rb_p4= new ePort ( ); 
public ePort rb_p5= new ePort ( ); 
public ePort rb_p6= new ePort ( ); 
public ePort rb_p7= new ePort ( ); 
public ePort rb_p8= new ePort ( ); 
public ePort rb_p9= new ePort ( ); 
public ePort rb_p10= new ePort ( ); 
public ePort rb_p11= new ePort ( ); 
public ePort rb_p12= new ePort ( ); 
public ePort rb_p13= new ePort ( ); 
public ePort rb_p14= new ePort ( ); 
public ePort rb_p15= new ePort ( ); 
public ePort rb_p16= new ePort ( ); 
public ePort rb_p17= new ePort ( ); 
public ePort rb_p18= new ePort ( ); 
public ePort rb_p19= new ePort ( ); 
public ePort rb_p20= new ePort ( ); 
public ePort rb_p21= new ePort ( ); 
public ePort rb_p22= new ePort ( ); 
public ePort rb_p23= new ePort ( ); 
public ePort rb_p24= new ePort ( ); 
public ePort rb_p25= new ePort ( ); 
public ePort rb_p26= new ePort ( ); 
public ePort rb_p27= new ePort ( ); 

 @AtomMethodName(name="initial")
 public int initial(){
 int _r=0;
 if( initial.getVal() ==true  ){ROBOTID.setVal(robot_id.getVal() );
TEXT.setVal("*************STARTING*************"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
_r=1;
 // Activate next states 
START.setVal(true);
initial.setVal(false);
 
   } return _r;}
 @AtomMethodName(name="p0")  
 public int p0(){
 int _r=0;
 if(  START.getVal( )==true  && p0.isAvailable() == false  )
{
p0.setAvailable(true);  
}
 if( p0.isAvailable() ){
p0.setAvailable(false);
TEXT.setVal("CHECK ROBOT REQUEST READY"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 //Command.checkRobotReadyRequest( REQ.getVal() , ROBOTID.getVal() );
ISREADY.setVal( Command.robotReadyResponse( REQ.getVal() , ROBOTID.getVal() ) );

 // Deactivate previous states 
START.setVal(false);
 // Activate next states 
AFTERSTART.setVal(true);
 
_r=1;
  p0.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p1")  
 public int p1(){
 int _r=0;
 if(  AFTERSTART.getVal( )==true  && p1.isAvailable() == false  && (ISREADY.getVal() == 1 ) )
{
p1.setAvailable(true);  
}
 if( p1.isAvailable() ){
p1.setAvailable(false);
TEXT.setVal("IS READY"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );

 // Deactivate previous states 
AFTERSTART.setVal(false);
 // Activate next states 
S0.setVal(true);
 
_r=1;
  p1.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p2")  
 public int p2(){
 int _r=0;
 if(  AFTERSTART.getVal( )==true  && p2.isAvailable() == false  && ( !(ISREADY.getVal() == 1) ) )
{
p2.setAvailable(true);  
}
 if( p2.isAvailable() ){
p2.setAvailable(false);
TEXT.setVal("IS NOT READY"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 Command.waitForTask( );

 // Deactivate previous states 
AFTERSTART.setVal(false);
 // Activate next states 
START.setVal(true);
 
_r=1;
  p2.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p3")  
 public int p3(){
 int _r=0;
 if(  S0.getVal( )==true  && p3.isAvailable() == false  )
{
p3.setAvailable(true);  
}
 if( p3.isAvailable() ){
p3.setAvailable(false);
TEXT.setVal("NEW PICK POINT REQUEST"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 Command.sendNewPickPointRequest( REQ.getVal() , ROBOTID.getVal() );

 // Deactivate previous states 
S0.setVal(false);
 // Activate next states 
S1.setVal(true);
 
_r=1;
  p3.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p4")  
 public int p4(){
 int _r=0;
 if(  S1.getVal( )==true  && p4.isAvailable() == false  )
{
p4.setAvailable(true);  
}
 if( p4.isAvailable() ){
p4.setAvailable(false);
TEXT.setVal("NEW PICK POINT RESPONSE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
RESPONSE.setVal( Command.sendNewPickPointResponse( REQ.getVal() , ROBOTID.getVal() ) );

 // Deactivate previous states 
S1.setVal(false);
 // Activate next states 
S2.setVal(true);
 
_r=1;
  p4.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p5")  
 public int p5(){
 int _r=0;
 if(  S2.getVal( )==true  && p5.isAvailable() == false  && ( !(RESPONSE.getVal() == 1) ) )
{
p5.setAvailable(true);  
}
 if( p5.isAvailable() ){
p5.setAvailable(false);
TEXT.setVal("NEW PICK POINT RESPONSE IS FALSE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 Command.waitForTask( );

 // Deactivate previous states 
S2.setVal(false);
 // Activate next states 
S0.setVal(true);
 
_r=1;
  p5.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p6")  
 public int p6(){
 int _r=0;
 if(  S2.getVal( )==true  && p6.isAvailable() == false  && (RESPONSE.getVal() == 1 ) )
{
p6.setAvailable(true);  
}
 if( p6.isAvailable() ){
p6.setAvailable(false);
TEXT.setVal("NEW PICK POINT RESPONSE IS TRUE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );

 // Deactivate previous states 
S2.setVal(false);
 // Activate next states 
S4.setVal(true);
 
_r=1;
  p6.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p9")  
 public int p9(){
 int _r=0;
 if(  S4.getVal( )==true  && p9.isAvailable() == false  )
{
p9.setAvailable(true);  
}
 if( p9.isAvailable() ){
p9.setAvailable(false);
TEXT.setVal("GOTO PICKPOINT"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
XDATA.setVal(1 );
RESPONSE.setVal( Command.sendGoto( ROBOTID.getVal() , XDATA.getVal() ) );

 // Deactivate previous states 
S4.setVal(false);
 // Activate next states 
S5.setVal(true);
 
_r=1;
  p9.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p10")  
 public int p10(){
 int _r=0;
 if(  S5.getVal( )==true  && p10.isAvailable() == false  && (RESPONSE.getVal() == 1 ) )
{
p10.setAvailable(true);  
}
 if( p10.isAvailable() ){
p10.setAvailable(false);
TEXT.setVal(" HAS GOTO PICKPOINT RESPONSE IS TRUE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );

 // Deactivate previous states 
S5.setVal(false);
 // Activate next states 
S6.setVal(true);
 
_r=1;
  p10.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p11")  
 public int p11(){
 int _r=0;
 if(  S5.getVal( )==true  && p11.isAvailable() == false  && ( !(RESPONSE.getVal() == 1) ) )
{
p11.setAvailable(true);  
}
 if( p11.isAvailable() ){
p11.setAvailable(false);
TEXT.setVal(" HAS GOTO PICKPOINT RESPONSE IS FALSE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
TEXT.setVal(" RISING ALARM"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 Command.finish( );

 // Deactivate previous states 
S5.setVal(false);
 // Activate next states 
SFINAL.setVal(true);
 
_r=1;
  p11.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p12")  
 public int p12(){
 int _r=0;
 if(  S6.getVal( )==true  && p12.isAvailable() == false  )
{
p12.setAvailable(true);  
}
 if( p12.isAvailable() ){
p12.setAvailable(false);
TEXT.setVal(" GET THE MARKER ID"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
MARKERID.setVal( Command.checkMerker( REQ.getVal() , ROBOTID.getVal() ) );

 // Deactivate previous states 
S6.setVal(false);
 // Activate next states 
S7.setVal(true);
 
_r=1;
  p12.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p13")  
 public int p13(){
 int _r=0;
 if(  S7.getVal( )==true  && p13.isAvailable() == false  && (MARKERID.getVal() != 0 ) )
{
p13.setAvailable(true);  
}
 if( p13.isAvailable() ){
p13.setAvailable(false);
TEXT.setVal(" HAS THE MARKER ID IS TRUE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );

 // Deactivate previous states 
S7.setVal(false);
 // Activate next states 
S8.setVal(true);
 
_r=1;
  p13.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p14")  
 public int p14(){
 int _r=0;
 if(  S7.getVal( )==true  && p14.isAvailable() == false  && (MARKERID.getVal() == 0 ) )
{
p14.setAvailable(true);  
}
 if( p14.isAvailable() ){
p14.setAvailable(false);
TEXT.setVal(" HAS THE MARKER ID IS FALSE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 Command.noCartNotice( XDATA.getVal() , YDATA.getVal() , ZDATA.getVal() );
CARTNOTICERESPONSE.setVal( Command.cartNoticeResponse( ) );

 // Deactivate previous states 
S7.setVal(false);
 // Activate next states 
S9.setVal(true);
 
_r=1;
  p14.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p15")  
 public int p15(){
 int _r=0;
 if(  S9.getVal( )==true  && p15.isAvailable() == false  && (CARTNOTICERESPONSE.getVal() == 1 ) )
{
p15.setAvailable(true);  
}
 if( p15.isAvailable() ){
p15.setAvailable(false);
TEXT.setVal("  CART NOTICE RESPONSE IS TRUE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 Command.waitForTask( );

 // Deactivate previous states 
S9.setVal(false);
 // Activate next states 
S0.setVal(true);
 
_r=1;
  p15.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p16")  
 public int p16(){
 int _r=0;
 if(  S8.getVal( )==true  && p16.isAvailable() == false  )
{
p16.setAvailable(true);  
}
 if( p16.isAvailable() ){
p16.setAvailable(false);
TEXT.setVal(" PICK CART"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
PICKCARTRESPONSE.setVal( Command.pickcart( REQ.getVal() , MARKERID.getVal() ) );

 // Deactivate previous states 
S8.setVal(false);
 // Activate next states 
S10.setVal(true);
 
_r=1;
  p16.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p17")  
 public int p17(){
 int _r=0;
 if(  S10.getVal( )==true  && p17.isAvailable() == false  && (PICKCARTRESPONSE.getVal() == 1 ) )
{
p17.setAvailable(true);  
}
 if( p17.isAvailable() ){
p17.setAvailable(false);
TEXT.setVal(" PICK CART IS TRUE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );

 // Deactivate previous states 
S10.setVal(false);
 // Activate next states 
S11.setVal(true);
 
_r=1;
  p17.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p18")  
 public int p18(){
 int _r=0;
 if(  S10.getVal( )==true  && p18.isAvailable() == false  && ( !(PICKCARTRESPONSE.getVal() == 1) ) )
{
p18.setAvailable(true);  
}
 if( p18.isAvailable() ){
p18.setAvailable(false);
TEXT.setVal(" PICK MISSION FAILED"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
TEXT.setVal(" RISING ALARM"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 Command.finish( );

 // Deactivate previous states 
S10.setVal(false);
 // Activate next states 
SFINAL.setVal(true);
 
_r=1;
  p18.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p17_1")  
 public int p17_1(){
 int _r=0;
 if(  S11.getVal( )==true  && p17_1.isAvailable() == false  )
{
p17_1.setAvailable(true);  
}
 if( p17_1.isAvailable() ){
p17_1.setAvailable(false);
TEXT.setVal(" SEND NEW STORAGE POINT REQUEST"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 Command.sendStoragePointRequest( REQ.getVal() , MARKERID.getVal() );

 // Deactivate previous states 
S11.setVal(false);
 // Activate next states 
S11_1.setVal(true);
 
_r=1;
  p17_1.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p17_2")  
 public int p17_2(){
 int _r=0;
 if(  S11_1.getVal( )==true  && p17_2.isAvailable() == false  )
{
p17_2.setAvailable(true);  
}
 if( p17_2.isAvailable() ){
p17_2.setAvailable(false);
TEXT.setVal(" RECEIVE NEW STORAGE POINT RESPONSE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 Command.receiveStoragePointResponse( REQ.getVal() , ROBOTID.getVal() );
HASNEWPOINT.setVal( Command.hasNewpoint( ) );

 // Deactivate previous states 
S11_1.setVal(false);
 // Activate next states 
S11_2.setVal(true);
 
_r=1;
  p17_2.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p19")  
 public int p19(){
 int _r=0;
 if(  S11_2.getVal( )==true  && p19.isAvailable() == false  && (HASNEWPOINT.getVal() == 1 ) )
{
p19.setAvailable(true);  
}
 if( p19.isAvailable() ){
p19.setAvailable(false);
TEXT.setVal(" SEND GOTO"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
XDATA.setVal(3 );
RESPONSE.setVal( Command.sendGoto( ROBOTID.getVal() , XDATA.getVal() ) );

 // Deactivate previous states 
S11_2.setVal(false);
 // Activate next states 
S12.setVal(true);
 
_r=1;
  p19.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p20")  
 public int p20(){
 int _r=0;
 if(  S12.getVal( )==true  && p20.isAvailable() == false  && (RESPONSE.getVal() != 1 ) )
{
p20.setAvailable(true);  
}
 if( p20.isAvailable() ){
p20.setAvailable(false);
TEXT.setVal(" GOTO RESPONSE IS FALSE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
TEXT.setVal(" RISING ALARM"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 Command.finish( );

 // Deactivate previous states 
S12.setVal(false);
 // Activate next states 
SFINAL.setVal(true);
 
_r=1;
  p20.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p21")  
 public int p21(){
 int _r=0;
 if(  S12.getVal( )==true  && p21.isAvailable() == false  && (RESPONSE.getVal() == 1 ) )
{
p21.setAvailable(true);  
}
 if( p21.isAvailable() ){
p21.setAvailable(false);
TEXT.setVal(" GOTO RESPONSE IS TRUE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
TEXT.setVal(" GET THE MARKER ID"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 Command.checkMerker( REQ.getVal() , ROBOTID.getVal() );
MARKERID.setVal( Command.markerReturn( REQ.getVal() , ROBOTID.getVal() ) );

 // Deactivate previous states 
S12.setVal(false);
 // Activate next states 
S13.setVal(true);
 
_r=1;
  p21.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p21_1")  
 public int p21_1(){
 int _r=0;
 if(  S13.getVal( )==true  && p21_1.isAvailable() == false  && (MARKERID.getVal() == 1 ) )
{
p21_1.setAvailable(true);  
}
 if( p21_1.isAvailable() ){
p21_1.setAvailable(false);
TEXT.setVal(" SEND DOOR STATUS RESUEST"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 Command.doorStatusRequest( REQ.getVal() , ROBOTID.getVal() );

 // Deactivate previous states 
S13.setVal(false);
 // Activate next states 
S13_1.setVal(true);
 
_r=1;
  p21_1.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p21_2")  
 public int p21_2(){
 int _r=0;
 if(  S13_1.getVal( )==true  && p21_2.isAvailable() == false  )
{
p21_2.setAvailable(true);  
}
 if( p21_2.isAvailable() ){
p21_2.setAvailable(false);
TEXT.setVal(" RECEIVE DOOR STATUS RESPONSE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
DOORSTATE.setVal( Command.doorStatusResponse( REQ.getVal() , ROBOTID.getVal() ) );

 // Deactivate previous states 
S13_1.setVal(false);
 // Activate next states 
S13_2.setVal(true);
 
_r=1;
  p21_2.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p21_3")  
 public int p21_3(){
 int _r=0;
 if(  S13_2.getVal( )==true  && p21_3.isAvailable() == false  && (DOORSTATE.getVal() != 1 ) )
{
p21_3.setAvailable(true);  
}
 if( p21_3.isAvailable() ){
p21_3.setAvailable(false);
TEXT.setVal(" SEND OPEN DOOR STATUS REQUEST/RESPONSE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
XDATA.setVal(3 );
 Command.openDoorRequest( ROBOTID.getVal() , XDATA.getVal() );
DOORRESPONSE.setVal( Command.openDoorResponse( ROBOTID.getVal() , XDATA.getVal() ) );

 // Deactivate previous states 
S13_2.setVal(false);
 // Activate next states 
S13_3.setVal(true);
 
_r=1;
  p21_3.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p21_4")  
 public int p21_4(){
 int _r=0;
 if(  S13_3.getVal( )==true  && p21_4.isAvailable() == false  && (DOORRESPONSE.getVal() == 1 ) )
{
p21_4.setAvailable(true);  
}
 if( p21_4.isAvailable() ){
p21_4.setAvailable(false);

 // Deactivate previous states 
S13_3.setVal(false);
 // Activate next states 
S13_4.setVal(true);
 
_r=1;
  p21_4.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p21_5")  
 public int p21_5(){
 int _r=0;
 if(  S13_3.getVal( )==true  && p21_5.isAvailable() == false  && (DOORRESPONSE.getVal() != 1 ) )
{
p21_5.setAvailable(true);  
}
 if( p21_5.isAvailable() ){
p21_5.setAvailable(false);
TEXT.setVal(" DOOR RESPONSE IS FALSE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
TEXT.setVal(" RISING ALARM"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 Command.finish( );

 // Deactivate previous states 
S13_3.setVal(false);
 // Activate next states 
SFINAL.setVal(true);
 
_r=1;
  p21_5.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p24")  
 public int p24(){
 int _r=0;
 if(  S13_4.getVal( )==true  && p24.isAvailable() == false  )
{
p24.setAvailable(true);  
}
 if( p24.isAvailable() ){
p24.setAvailable(false);
TEXT.setVal(" DOOR RESPONSE IS TRUE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
TEXT.setVal(" SEND GOTO STORAGE POINT"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
XDATA.setVal(2 );
RESPONSE.setVal( Command.sendGoto( ROBOTID.getVal() , XDATA.getVal() ) );

 // Deactivate previous states 
S13_4.setVal(false);
 // Activate next states 
S16.setVal(true);
 
_r=1;
  p24.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p25")  
 public int p25(){
 int _r=0;
 if(  S16.getVal( )==true  && p25.isAvailable() == false  && (RESPONSE.getVal() == 0 ) )
{
p25.setAvailable(true);  
}
 if( p25.isAvailable() ){
p25.setAvailable(false);
TEXT.setVal(" GOTO RESPONSE IS FALSE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
TEXT.setVal(" RISING ALARM"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 Command.finish( );

 // Deactivate previous states 
S16.setVal(false);
 // Activate next states 
SFINAL.setVal(true);
 
_r=1;
  p25.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p26")  
 public int p26(){
 int _r=0;
 if(  S16.getVal( )==true  && p26.isAvailable() == false  && (RESPONSE.getVal() != 0 ) )
{
p26.setAvailable(true);  
}
 if( p26.isAvailable() ){
p26.setAvailable(false);
TEXT.setVal(" GOTO RESPONSE IS TRUE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
TEXT.setVal(" PLACE CART"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
PLACECARTRESPONSE.setVal( Command.placeCart( REQ.getVal() , CARTID.getVal() ) );

 // Deactivate previous states 
S16.setVal(false);
 // Activate next states 
S25.setVal(true);
 
_r=1;
  p26.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p27")  
 public int p27(){
 int _r=0;
 if(  S25.getVal( )==true  && p27.isAvailable() == false  && (PLACECARTRESPONSE.getVal() != 1 ) )
{
p27.setAvailable(true);  
}
 if( p27.isAvailable() ){
p27.setAvailable(false);
TEXT.setVal(" PLACE CART RESPONSE IS FALSE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
TEXT.setVal(" RISING ALARM"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 Command.finish( );

 // Deactivate previous states 
S25.setVal(false);
 // Activate next states 
SFINAL.setVal(true);
 
_r=1;
  p27.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p28")  
 public int p28(){
 int _r=0;
 if(  S25.getVal( )==true  && p28.isAvailable() == false  && (PLACECARTRESPONSE.getVal() == 1 ) )
{
p28.setAvailable(true);  
}
 if( p28.isAvailable() ){
p28.setAvailable(false);
TEXT.setVal(" PLACE CART RESPONSE IS TRUE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
TEXT.setVal(" SEND CART MOVED NOTICE "  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 Command.cartMovedNotice( REQ.getVal() , ROBOTID.getVal() );

 // Deactivate previous states 
S25.setVal(false);
 // Activate next states 
S26.setVal(true);
 
_r=1;
  p28.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p29")  
 public int p29(){
 int _r=0;
 if(  S26.getVal( )==true  && p29.isAvailable() == false  )
{
p29.setAvailable(true);  
}
 if( p29.isAvailable() ){
p29.setAvailable(false);
TEXT.setVal(" CART NOTICE RESPONSE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 Command.cartNoticeResponse( );

 // Deactivate previous states 
S26.setVal(false);
 // Activate next states 
S17.setVal(true);
 
_r=1;
  p29.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p30")  
 public int p30(){
 int _r=0;
 if(  S17.getVal( )==true  && p30.isAvailable() == false  )
{
p30.setAvailable(true);  
}
 if( p30.isAvailable() ){
p30.setAvailable(false);
TEXT.setVal(" SEND DOCKING REQUEST"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 Command.dockingRequest( REQ.getVal() , CARTID.getVal() );
TEXT.setVal(" SEND DOCKING RESPONSE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
PLACEDOCKINGRESPONSE.setVal( Command.dockingResponse( REQ.getVal() , CARTID.getVal() ) );

 // Deactivate previous states 
S17.setVal(false);
 // Activate next states 
S18.setVal(true);
 
_r=1;
  p30.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p31")  
 public int p31(){
 int _r=0;
 if(  S18.getVal( )==true  && p31.isAvailable() == false  && (PLACEDOCKINGRESPONSE.getVal() == 1 ) )
{
p31.setAvailable(true);  
}
 if( p31.isAvailable() ){
p31.setAvailable(false);
TEXT.setVal(" DOCKING RESPONSE IS TRUE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
TEXT.setVal(" SEND GOTO DOCK AUXILARY POINT"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
XDATA.setVal(5 );
RESPONSE.setVal( Command.sendGoto( ROBOTID.getVal() , XDATA.getVal() ) );

 // Deactivate previous states 
S18.setVal(false);
 // Activate next states 
S19.setVal(true);
 
_r=1;
  p31.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p32")  
 public int p32(){
 int _r=0;
 if(  S19.getVal( )==true  && p32.isAvailable() == false  && (RESPONSE.getVal() == 0 ) )
{
p32.setAvailable(true);  
}
 if( p32.isAvailable() ){
p32.setAvailable(false);
TEXT.setVal(" GOTO RESPONSE IS FALSE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
TEXT.setVal(" RISING ALARM"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 Command.finish( );

 // Deactivate previous states 
S19.setVal(false);
 // Activate next states 
SFINAL.setVal(true);
 
_r=1;
  p32.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p33")  
 public int p33(){
 int _r=0;
 if(  S19.getVal( )==true  && p33.isAvailable() == false  && (RESPONSE.getVal() != 0 ) )
{
p33.setAvailable(true);  
}
 if( p33.isAvailable() ){
p33.setAvailable(false);
TEXT.setVal(" GOTO RESPONSE IS TRUE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
TEXT.setVal(" GET THE MARKER ID"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 Command.checkMerker( REQ.getVal() , ROBOTID.getVal() );
MARKERID.setVal( Command.markerReturn( REQ.getVal() , ROBOTID.getVal() ) );

 // Deactivate previous states 
S19.setVal(false);
 // Activate next states 
S20.setVal(true);
 
_r=1;
  p33.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p34_1")  
 public int p34_1(){
 int _r=0;
 if(  S20.getVal( )==true  && p34_1.isAvailable() == false  && (MARKERID.getVal() == 1 ) )
{
p34_1.setAvailable(true);  
}
 if( p34_1.isAvailable() ){
p34_1.setAvailable(false);
TEXT.setVal(" SEND DOOR STATUS RESUEST"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 Command.doorStatusRequest( REQ.getVal() , ROBOTID.getVal() );

 // Deactivate previous states 
S20.setVal(false);
 // Activate next states 
S20_1.setVal(true);
 
_r=1;
  p34_1.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p34_2")  
 public int p34_2(){
 int _r=0;
 if(  S20_1.getVal( )==true  && p34_2.isAvailable() == false  )
{
p34_2.setAvailable(true);  
}
 if( p34_2.isAvailable() ){
p34_2.setAvailable(false);
TEXT.setVal(" RECEIVE DOOR STATUS RESPONSE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
DOORSTATE.setVal( Command.doorStatusResponse( REQ.getVal() , ROBOTID.getVal() ) );

 // Deactivate previous states 
S20_1.setVal(false);
 // Activate next states 
S20_2.setVal(true);
 
_r=1;
  p34_2.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p34_3")  
 public int p34_3(){
 int _r=0;
 if(  S20_2.getVal( )==true  && p34_3.isAvailable() == false  && (DOORSTATE.getVal() != 1 ) )
{
p34_3.setAvailable(true);  
}
 if( p34_3.isAvailable() ){
p34_3.setAvailable(false);
TEXT.setVal(" SEND OPEN DOOR STATUS REQUEST/RESPONSE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
XDATA.setVal(3 );
 Command.openDoorRequest( ROBOTID.getVal() , XDATA.getVal() );
DOORRESPONSE.setVal( Command.openDoorResponse( ROBOTID.getVal() , XDATA.getVal() ) );

 // Deactivate previous states 
S20_2.setVal(false);
 // Activate next states 
S20_3.setVal(true);
 
_r=1;
  p34_3.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p34_4")  
 public int p34_4(){
 int _r=0;
 if(  S20_3.getVal( )==true  && p34_4.isAvailable() == false  && (DOORRESPONSE.getVal() == 1 ) )
{
p34_4.setAvailable(true);  
}
 if( p34_4.isAvailable() ){
p34_4.setAvailable(false);

 // Deactivate previous states 
S20_3.setVal(false);
 // Activate next states 
S21.setVal(true);
 
_r=1;
  p34_4.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p34_5")  
 public int p34_5(){
 int _r=0;
 if(  S20_3.getVal( )==true  && p34_5.isAvailable() == false  && (DOORRESPONSE.getVal() != 1 ) )
{
p34_5.setAvailable(true);  
}
 if( p34_5.isAvailable() ){
p34_5.setAvailable(false);
TEXT.setVal(" DOOR RESPONSE IS FALSE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
TEXT.setVal(" RISING ALARM"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 Command.finish( );

 // Deactivate previous states 
S20_3.setVal(false);
 // Activate next states 
SFINAL.setVal(true);
 
_r=1;
  p34_5.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p35")  
 public int p35(){
 int _r=0;
 if(  S21.getVal( )==true  && p35.isAvailable() == false  && (DOORSTATE.getVal() == 1 ) )
{
p35.setAvailable(true);  
}
 if( p35.isAvailable() ){
p35.setAvailable(false);
TEXT.setVal(" DOOR RESPONSE IS TRUE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
TEXT.setVal(" GOTO DOCKING AREA"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
XDATA.setVal(4 );
RESPONSE.setVal( Command.sendGoto( ROBOTID.getVal() , XDATA.getVal() ) );

 // Deactivate previous states 
S21.setVal(false);
 // Activate next states 
S22.setVal(true);
 
_r=1;
  p35.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p41")  
 public int p41(){
 int _r=0;
 if(  S22.getVal( )==true  && p41.isAvailable() == false  && (RESPONSE.getVal() != 1 ) )
{
p41.setAvailable(true);  
}
 if( p41.isAvailable() ){
p41.setAvailable(false);
TEXT.setVal(" GOTO RESPONSE IS FALSE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
TEXT.setVal(" RISING ALARM"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );
 Command.finish( );

 // Deactivate previous states 
S22.setVal(false);
 // Activate next states 
SFINAL.setVal(true);
 
_r=1;
  p41.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p39")  
 public int p39(){
 int _r=0;
 if(  S22.getVal( )==true  && p39.isAvailable() == false  && (RESPONSE.getVal() == 1 ) )
{
p39.setAvailable(true);  
}
 if( p39.isAvailable() ){
p39.setAvailable(false);
TEXT.setVal(" GOTO RESPONSE IS TRUE"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );

 // Deactivate previous states 
S22.setVal(false);
 // Activate next states 
S24.setVal(true);
 
_r=1;
  p39.conceal(); 
  }

 
 return _r;}


 @AtomMethodName(name="p42")  
 public int p42(){
 int _r=0;
 if(  S24.getVal( )==true  && p42.isAvailable() == false  )
{
p42.setAvailable(true);  
}
 if( p42.isAvailable() ){
p42.setAvailable(false);
TEXT.setVal(" **************END OF THE FIRST STEP***************"  );
 Command.write( ROBOTID.getVal() , TEXT.getVal() );

 // Deactivate previous states 
S24.setVal(false);
 // Activate next states 
S0.setVal(true);
 
_r=1;
  p42.conceal(); 
  }

 
 return _r;}

}