public class gsl extends gqx<chh, gys, gcd> {
   private static final akv a = akv.b("textures/entity/fox/fox.png");
   private static final akv b = akv.b("textures/entity/fox/fox_sleep.png");
   private static final akv k = akv.b("textures/entity/fox/snow_fox.png");
   private static final akv l = akv.b("textures/entity/fox/snow_fox_sleep.png");

   public gsl(gsd.a $$0) {
      super($$0, new gcd($$0.a(gfb.aN)), new gcd($$0.a(gfb.aO)), 0.4F);
      this.a(new gwe(this));
   }

   protected void a(gys $$0, fft $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.ab));
      }
   }

   public akv a(gys $$0) {
      if ($$0.h == chh.v.a) {
         return $$0.d ? b : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public gys b() {
      return new gys();
   }

   public void a(chh $$0, gys $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gyy.a($$0, $$1, this.i);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.ci();
      $$1.b = $$0.K($$2);
      $$1.d = $$0.fR();
      $$1.e = $$0.x();
      $$1.f = $$0.gs();
      $$1.g = $$0.gt();
      $$1.h = $$0.t();
   }
}
