public class gox extends gop<clc, gut, fyj> {
   private static final alc a = alc.b("textures/entity/phantom.png");

   public gox(gnj.a $$0) {
      super($$0, new fyj($$0.a(gak.bs)), 0.75F);
      this.a(new gru(this));
   }

   public alc a(gut $$0) {
      return a;
   }

   public gut c() {
      return new gut();
   }

   public void a(clc $$0, gut $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.t() + $$1.p;
      $$1.b = $$0.q();
   }

   protected void a(gut $$0, fde $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(gut $$0, fde $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.V));
   }
}
