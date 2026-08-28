public class gsk extends gqw<chh, gyr, gcd> {
   private static final aku a = aku.b("textures/entity/fox/fox.png");
   private static final aku b = aku.b("textures/entity/fox/fox_sleep.png");
   private static final aku k = aku.b("textures/entity/fox/snow_fox.png");
   private static final aku l = aku.b("textures/entity/fox/snow_fox_sleep.png");

   public gsk(gsc.a $$0) {
      super($$0, new gcd($$0.a(gfb.aN)), new gcd($$0.a(gfb.aO)), 0.4F);
      this.a(new gwd(this));
   }

   protected void a(gyr $$0, ffu $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.ab));
      }
   }

   public aku a(gyr $$0) {
      if ($$0.h == chh.v.a) {
         return $$0.d ? b : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public gyr b() {
      return new gyr();
   }

   public void a(chh $$0, gyr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gyx.a($$0, $$1, this.i);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.ci();
      $$1.b = $$0.K($$2);
      $$1.d = $$0.fR();
      $$1.e = $$0.x();
      $$1.f = $$0.gp();
      $$1.g = $$0.gq();
      $$1.h = $$0.t();
   }
}
