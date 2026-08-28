public class gxb extends gvn<cjo, hdi, ggo> {
   private static final alg a = alg.b("textures/entity/fox/fox.png");
   private static final alg j = alg.b("textures/entity/fox/fox_sleep.png");
   private static final alg k = alg.b("textures/entity/fox/snow_fox.png");
   private static final alg l = alg.b("textures/entity/fox/snow_fox_sleep.png");

   public gxb(gwt.a $$0) {
      super($$0, new ggo($$0.a(gjn.aX)), new ggo($$0.a(gjn.aY)), 0.4F);
      this.a(new hau(this));
   }

   protected void a(hdi $$0, fjy $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.ab));
      }
   }

   public alg a(hdi $$0) {
      if ($$0.h == cjo.v.a) {
         return $$0.d ? j : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public hdi b() {
      return new hdi();
   }

   public void a(cjo $$0, hdi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hdo.a($$0, $$1, this.h);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.cg();
      $$1.b = $$0.K($$2);
      $$1.d = $$0.fQ();
      $$1.e = $$0.x();
      $$1.f = $$0.gt();
      $$1.g = $$0.gu();
      $$1.h = $$0.t();
   }
}
