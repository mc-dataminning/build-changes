public class gvm extends gxf<cnl, hby, gfi> {
   private static final alg a = alg.b("textures/entity/creeper/creeper.png");

   public gvm(gvz.a $$0) {
      super($$0, new gfi($$0.a(git.ao)), 0.5F);
      this.a(new gzq(this, $$0.f()));
   }

   protected void a(hby $$0, fjc $$1) {
      float $$2 = $$0.a;
      float $$3 = 1.0F + azm.a($$2 * 100.0F) * $$2 * 0.01F;
      $$2 = azm.a($$2, 0.0F, 1.0F);
      $$2 *= $$2;
      $$2 *= $$2;
      float $$4 = (1.0F + $$2 * 0.4F) * $$3;
      float $$5 = (1.0F + $$2 * 0.1F) / $$3;
      $$1.b($$4, $$5, $$4);
   }

   protected float a(hby $$0) {
      float $$1 = $$0.a;
      return (int)($$1 * 10.0F) % 2 == 0 ? 0.0F : azm.a($$1, 0.5F, 1.0F);
   }

   public alg b(hby $$0) {
      return a;
   }

   public hby a() {
      return new hby();
   }

   public void a(cnl $$0, hby $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.m();
   }
}
