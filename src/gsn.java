public class gsn extends gqz<chj, gyu, gcf> {
   private static final akv a = akv.b("textures/entity/fox/fox.png");
   private static final akv b = akv.b("textures/entity/fox/fox_sleep.png");
   private static final akv k = akv.b("textures/entity/fox/snow_fox.png");
   private static final akv l = akv.b("textures/entity/fox/snow_fox_sleep.png");

   public gsn(gsf.a $$0) {
      super($$0, new gcf($$0.a(gfd.aN)), new gcf($$0.a(gfd.aO)), 0.4F);
      this.a(new gwg(this));
   }

   protected void a(gyu $$0, ffv $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.ab));
      }
   }

   public akv a(gyu $$0) {
      if ($$0.h == chj.v.a) {
         return $$0.d ? b : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public gyu b() {
      return new gyu();
   }

   public void a(chj $$0, gyu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gza.a($$0, $$1, this.i);
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
