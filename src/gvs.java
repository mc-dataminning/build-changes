public class gvs extends gue<ciz, hby, gfh> {
   private static final ale a = ale.b("textures/entity/fox/fox.png");
   private static final ale j = ale.b("textures/entity/fox/fox_sleep.png");
   private static final ale k = ale.b("textures/entity/fox/snow_fox.png");
   private static final ale l = ale.b("textures/entity/fox/snow_fox_sleep.png");

   public gvs(gvk.a $$0) {
      super($$0, new gfh($$0.a(gif.aT)), new gfh($$0.a(gif.aU)), 0.4F);
      this.a(new gzl(this));
   }

   protected void a(hby $$0, fiq $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.ab));
      }
   }

   public ale a(hby $$0) {
      if ($$0.h == ciz.v.a) {
         return $$0.d ? j : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public hby b() {
      return new hby();
   }

   public void a(ciz $$0, hby $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hce.a($$0, $$1, this.h);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.ci();
      $$1.b = $$0.K($$2);
      $$1.d = $$0.fQ();
      $$1.e = $$0.x();
      $$1.f = $$0.gq();
      $$1.g = $$0.gr();
      $$1.h = $$0.t();
   }
}
