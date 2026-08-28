public class gun extends gsz<ciq, hat, gee> {
   private static final ald a = ald.b("textures/entity/fox/fox.png");
   private static final ald j = ald.b("textures/entity/fox/fox_sleep.png");
   private static final ald k = ald.b("textures/entity/fox/snow_fox.png");
   private static final ald l = ald.b("textures/entity/fox/snow_fox_sleep.png");

   public gun(guf.a $$0) {
      super($$0, new gee($$0.a(ghc.aT)), new gee($$0.a(ghc.aU)), 0.4F);
      this.a(new gyg(this));
   }

   protected void a(hat $$0, fho $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.ab));
      }
   }

   public ald a(hat $$0) {
      if ($$0.h == ciq.v.a) {
         return $$0.d ? j : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public hat b() {
      return new hat();
   }

   public void a(ciq $$0, hat $$1, float $$2) {
      super.a($$0, $$1, $$2);
      haz.a($$0, $$1, this.h);
      $$1.a = $$0.K($$2);
      $$1.c = $$0.ci();
      $$1.b = $$0.L($$2);
      $$1.d = $$0.fQ();
      $$1.e = $$0.x();
      $$1.f = $$0.gq();
      $$1.g = $$0.gr();
      $$1.h = $$0.t();
   }
}
