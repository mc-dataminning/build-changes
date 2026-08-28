public class gvt<T extends cpi> extends gxn<T, hcf, gfp> {
   private static final alg a = alg.b("textures/entity/creaking/creaking.png");
   private static final alg j = alg.b("textures/entity/creaking/creaking_eyes.png");

   public gvt(gwh.a $$0) {
      super($$0, new gfp($$0.a(gjb.ap)), 0.6F);
      this.a(new hao<>(this, j, ($$0x, $$1) -> 1.0F, gfp::b, gqk::q, true));
   }

   public alg a(hcf $$0) {
      return a;
   }

   public hcf a() {
      return new hcf();
   }

   public void a(T $$0, hcf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b.a($$0.bI);
      $$1.a.a($$0.bJ);
      $$1.c.a($$0.bK);
      if ($$0.gs()) {
         $$1.ac = 0.0F;
         $$1.am = false;
         $$1.d = $$0.gv();
      } else {
         $$1.d = $$0.gz();
      }

      $$1.e = $$0.n();
   }
}
