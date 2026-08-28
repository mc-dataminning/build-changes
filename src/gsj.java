public class gsj extends gqv<chg, gyq, gcb> {
   private static final aku a = aku.b("textures/entity/fox/fox.png");
   private static final aku b = aku.b("textures/entity/fox/fox_sleep.png");
   private static final aku k = aku.b("textures/entity/fox/snow_fox.png");
   private static final aku l = aku.b("textures/entity/fox/snow_fox_sleep.png");

   public gsj(gsb.a $$0) {
      super($$0, new gcb($$0.a(gez.aN)), new gcb($$0.a(gez.aO)), 0.4F);
      this.a(new gwc(this));
   }

   protected void a(gyq $$0, ffs $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.ab));
      }
   }

   public aku a(gyq $$0) {
      if ($$0.h == chg.v.a) {
         return $$0.d ? b : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public gyq b() {
      return new gyq();
   }

   public void a(chg $$0, gyq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gyw.a($$0, $$1, this.i);
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
