public class gyd extends gxf<coi, heb, ghp> {
   public static final alg a = alg.b("textures/entity/slime/slime.png");

   public gyd(gvz.a $$0) {
      super($$0, new ghp($$0.a(git.dc)), 0.25F);
      this.a(new har(this, $$0.f()));
   }

   protected float a(heb $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(heb $$0, fjc $$1) {
      float $$2 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$3 = (float)$$0.b;
      float $$4 = $$0.a / ($$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * $$3, 1.0F / $$5 * $$3, $$5 * $$3);
   }

   public alg b(heb $$0) {
      return a;
   }

   public heb b() {
      return new heb();
   }

   public void a(coi $$0, heb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azm.h($$2, $$0.bF, $$0.bE);
      $$1.b = $$0.go();
   }
}
