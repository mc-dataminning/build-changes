public class gxw<T extends cqf> extends gzq<T, hej, ght> {
   private static final alk a = alk.b("textures/entity/creaking/creaking.png");
   private static final alk j = alk.b("textures/entity/creaking/creaking_eyes.png");

   public gxw(gyk.a $$0) {
      super($$0, new ght($$0.a(glf.ap)), 0.6F);
      this.a(new hcr<>(this, j, ($$0x, $$1) -> 1.0F, ght::b, gsn::q, true));
   }

   public alk a(hej $$0) {
      return a;
   }

   public hej a() {
      return new hej();
   }

   public void a(T $$0, hej $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b.a($$0.bI);
      $$1.a.a($$0.bJ);
      $$1.c.a($$0.bK);
      if ($$0.gv()) {
         $$1.ac = 0.0F;
         $$1.am = false;
         $$1.d = $$0.gy();
      } else {
         $$1.d = $$0.gC();
      }

      $$1.e = $$0.n();
   }
}
