public class yu implements vf<wy> {
   private final gw a;
   private final boolean b;

   public yu(gw $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public yu(sq $$0) {
      this.a = $$0.e();
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public gw a() {
      return this.a;
   }

   public boolean d() {
      return this.b;
   }
}
