public class grp<T extends cnb> extends gtj<T, gyb, gbr> {
   private static final akv a = akv.b("textures/entity/creaking/creaking.png");
   private static final akv b = akv.b("textures/entity/creaking/creaking_eyes.png");

   public grp(gsd.a $$0) {
      super($$0, new gbr($$0.a(gfb.ah)), 0.6F);
      this.a(new gwl<>(this, b, ($$0x, $$1) -> 1.0F, gbr::b, gmh::q, true));
   }

   public akv a(gyb $$0) {
      return a;
   }

   public gyb a() {
      return new gyb();
   }

   public void a(T $$0, gyb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b.a($$0.ca);
      $$1.a.a($$0.cb);
      $$1.c.a($$0.cc);
      if ($$0.gv()) {
         $$1.ac = 0.0F;
         $$1.am = false;
         $$1.d = $$0.gy();
      } else {
         $$1.d = $$0.gC();
      }

      $$1.e = $$0.t();
   }
}
