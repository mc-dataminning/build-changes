public class wr implements uo<ur> {
   private final int a;
   private final acq b;

   public wr(int $$0, cjc<?> $$1) {
      this.a = $$0;
      this.b = $$1.e();
   }

   public wr(sf $$0) {
      this.a = $$0.readByte();
      this.b = $$0.t();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeByte(this.a);
      $$0.a(this.b);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public acq a() {
      return this.b;
   }

   public int c() {
      return this.a;
   }
}
