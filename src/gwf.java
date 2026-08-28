public class gwf<T extends cpp> extends gxz<T, hcr, ggb> {
   private static final alg a = alg.b("textures/entity/creaking/creaking.png");
   private static final alg j = alg.b("textures/entity/creaking/creaking_eyes.png");

   public gwf(gwt.a $$0) {
      super($$0, new ggb($$0.a(gjn.ap)), 0.6F);
      this.a(new hba<>(this, j, ($$0x, $$1) -> 1.0F, ggb::b, gqx::q, true));
   }

   public alg a(hcr $$0) {
      return a;
   }

   public hcr a() {
      return new hcr();
   }

   public void a(T $$0, hcr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b.a($$0.bI);
      $$1.a.a($$0.bJ);
      $$1.c.a($$0.bK);
      if ($$0.gu()) {
         $$1.ac = 0.0F;
         $$1.am = false;
         $$1.d = $$0.gx();
      } else {
         $$1.d = $$0.gB();
      }

      $$1.e = $$0.n();
   }
}
