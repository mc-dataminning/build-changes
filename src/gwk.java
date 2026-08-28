public class gwk<T extends cps> extends gye<T, hcx, ggg> {
   private static final alg a = alg.b("textures/entity/creaking/creaking.png");
   private static final alg j = alg.b("textures/entity/creaking/creaking_eyes.png");

   public gwk(gwy.a $$0) {
      super($$0, new ggg($$0.a(gjs.ap)), 0.6F);
      this.a(new hbf<>(this, j, ($$0x, $$1) -> 1.0F, ggg::b, grc::q, true));
   }

   public alg a(hcx $$0) {
      return a;
   }

   public hcx a() {
      return new hcx();
   }

   public void a(T $$0, hcx $$1, float $$2) {
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
