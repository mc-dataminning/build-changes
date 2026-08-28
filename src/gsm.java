public class gsm extends gqy<chi, gyt, gce> {
   private static final akv a = akv.b("textures/entity/fox/fox.png");
   private static final akv b = akv.b("textures/entity/fox/fox_sleep.png");
   private static final akv k = akv.b("textures/entity/fox/snow_fox.png");
   private static final akv l = akv.b("textures/entity/fox/snow_fox_sleep.png");

   public gsm(gse.a $$0) {
      super($$0, new gce($$0.a(gfc.aN)), new gce($$0.a(gfc.aO)), 0.4F);
      this.a(new gwf(this));
   }

   protected void a(gyt $$0, ffu $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.ab));
      }
   }

   public akv a(gyt $$0) {
      if ($$0.h == chi.v.a) {
         return $$0.d ? b : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public gyt b() {
      return new gyt();
   }

   public void a(chi $$0, gyt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gyz.a($$0, $$1, this.i);
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
