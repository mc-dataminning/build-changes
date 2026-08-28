public class gtr<T extends coo> extends gvl<T, hac, gdr> {
   private static final ald a = ald.b("textures/entity/creaking/creaking.png");
   private static final ald j = ald.b("textures/entity/creaking/creaking_eyes.png");

   public gtr(guf.a $$0) {
      super($$0, new gdr($$0.a(ghc.al)), 0.6F);
      this.a(new gym<>(this, j, ($$0x, $$1) -> 1.0F, gdr::b, goi::q, true));
   }

   public ald a(hac $$0) {
      return a;
   }

   public hac a() {
      return new hac();
   }

   public void a(T $$0, hac $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b.a($$0.bG);
      $$1.a.a($$0.bH);
      $$1.c.a($$0.bI);
      if ($$0.gr()) {
         $$1.ac = 0.0F;
         $$1.am = false;
         $$1.d = $$0.gu();
      } else {
         $$1.d = $$0.gy();
      }

      $$1.e = $$0.n();
   }
}
