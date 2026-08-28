public class gyl extends gxn<com, hej, ghx> {
   public static final alg a = alg.b("textures/entity/slime/slime.png");

   public gyl(gwh.a $$0) {
      super($$0, new ghx($$0.a(gjb.de)), 0.25F);
      this.a(new haz(this, $$0.f()));
   }

   protected float a(hej $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(hej $$0, fjj $$1) {
      float $$2 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$3 = (float)$$0.b;
      float $$4 = $$0.a / ($$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * $$3, 1.0F / $$5 * $$3, $$5 * $$3);
   }

   public alg b(hej $$0) {
      return a;
   }

   public hej b() {
      return new hej();
   }

   public void a(com $$0, hej $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azm.h($$2, $$0.bG, $$0.bF);
      $$1.b = $$0.gp();
   }
}
