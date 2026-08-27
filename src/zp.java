public class zp implements uo<zb> {
   private final int a;

   public zp(int $$0) {
      this.a = $$0;
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public zp(sf $$0) {
      this.a = $$0.readByte();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeByte(this.a);
   }

   public int a() {
      return this.a;
   }
}
