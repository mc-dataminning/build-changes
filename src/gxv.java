public class gxv extends gxn<cof, hdw, ggy> {
   private static final alg a = alg.b("textures/entity/phantom.png");

   public gxv(gwh.a $$0) {
      super($$0, new ggy($$0.a(gjb.cc)), 0.75F);
      this.a(new hat(this));
   }

   public alg a(hdw $$0) {
      return a;
   }

   public hdw b() {
      return new hdw();
   }

   public void a(cof $$0, hdw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = (float)$$0.m() + $$1.u;
      $$1.b = $$0.j();
   }

   protected void a(hdw $$0, fjj $$1) {
      float $$2 = 1.0F + 0.15F * (float)$$0.b;
      $$1.b($$2, $$2, $$2);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(hdw $$0, fjj $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a(a.b.rotationDegrees($$0.ab));
   }
}
