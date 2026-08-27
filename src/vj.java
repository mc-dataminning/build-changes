public class vj implements uo<ur> {
   private final int a;

   public vj(int $$0) {
      this.a = $$0;
   }

   public vj(sf $$0) {
      this.a = $$0.readUnsignedByte();
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
