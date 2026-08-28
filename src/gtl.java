public class gtl extends grx<chz, gzs, gdd> {
   private static final aku a = aku.b("textures/entity/fox/fox.png");
   private static final aku b = aku.b("textures/entity/fox/fox_sleep.png");
   private static final aku k = aku.b("textures/entity/fox/snow_fox.png");
   private static final aku l = aku.b("textures/entity/fox/snow_fox_sleep.png");

   public gtl(gtd.a $$0) {
      super($$0, new gdd($$0.a(ggb.aP)), new gdd($$0.a(ggb.aQ)), 0.4F);
      this.a(new gxe(this));
   }

   protected void a(gzs $$0, fgr $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.ab));
      }
   }

   public aku a(gzs $$0) {
      if ($$0.h == chz.v.a) {
         return $$0.d ? b : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public gzs b() {
      return new gzs();
   }

   public void a(chz $$0, gzs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gzy.a($$0, $$1, this.i);
      $$1.a = $$0.K($$2);
      $$1.c = $$0.ch();
      $$1.b = $$0.L($$2);
      $$1.d = $$0.fT();
      $$1.e = $$0.x();
      $$1.f = $$0.gs();
      $$1.g = $$0.gt();
      $$1.h = $$0.t();
   }
}
