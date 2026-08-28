public class gxh<T extends cqo> extends gzb<T, hdu, ghe> {
   private static final alr a = alr.b("textures/entity/creaking/creaking.png");
   private static final alr j = alr.b("textures/entity/creaking/creaking_eyes.png");

   public gxh(gxv.a $$0) {
      super($$0, new ghe($$0.a(gkq.ap)), 0.6F);
      this.a(new hcc<>(this, j, ($$0x, $$1) -> 1.0F, ghe::b, gry::q, true));
   }

   public alr a(hdu $$0) {
      return a;
   }

   public hdu a() {
      return new hdu();
   }

   public void a(T $$0, hdu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b.a($$0.bI);
      $$1.a.a($$0.bJ);
      $$1.c.a($$0.bK);
      if ($$0.gv()) {
         $$1.af = 0.0F;
         $$1.ap = false;
         $$1.d = $$0.gy();
      } else {
         $$1.d = $$0.gC();
      }

      $$1.e = $$0.n();
   }
}
