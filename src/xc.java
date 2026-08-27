public class xc implements ux<wp> {
   private final bgn a;
   private final boolean b;

   public xc(bgn $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public xc(si $$0) {
      this.a = bgn.a($$0.readUnsignedByte());
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(si $$0) {
      $$0.k(this.a.a());
      $$0.a(this.b);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.b;
   }

   public bgn d() {
      return this.a;
   }
}
