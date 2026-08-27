public class xr implements uo<ur> {
   private final int a;

   public xr(int $$0) {
      this.a = $$0;
   }

   public xr(sf $$0) {
      this.a = $$0.readByte();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeByte(this.a);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }
}
