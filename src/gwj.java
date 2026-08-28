public class gwj extends gvl<cns, hcg, gfz> {
   public static final ald a = ald.b("textures/entity/slime/slime.png");

   public gwj(guf.a $$0) {
      super($$0, new gfz($$0.a(ghc.da)), 0.25F);
      this.a(new gyx(this, $$0.f()));
   }

   protected float a(hcg $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(hcg $$0, fho $$1) {
      float $$2 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$3 = (float)$$0.b;
      float $$4 = $$0.a / ($$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * $$3, 1.0F / $$5 * $$3, $$5 * $$3);
   }

   public ald b(hcg $$0) {
      return a;
   }

   public hcg b() {
      return new hcg();
   }

   public void a(cns $$0, hcg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azk.h($$2, $$0.bE, $$0.bD);
      $$1.b = $$0.go();
   }
}
