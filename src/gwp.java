public class gwp extends gvb<cjj, hcw, ggc> {
   private static final alg a = alg.b("textures/entity/fox/fox.png");
   private static final alg j = alg.b("textures/entity/fox/fox_sleep.png");
   private static final alg k = alg.b("textures/entity/fox/snow_fox.png");
   private static final alg l = alg.b("textures/entity/fox/snow_fox_sleep.png");

   public gwp(gwh.a $$0) {
      super($$0, new ggc($$0.a(gjb.aX)), new ggc($$0.a(gjb.aY)), 0.4F);
      this.a(new hai(this));
   }

   protected void a(hcw $$0, fjj $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.ab));
      }
   }

   public alg a(hcw $$0) {
      if ($$0.h == cjj.v.a) {
         return $$0.d ? j : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public hcw b() {
      return new hcw();
   }

   public void a(cjj $$0, hcw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hdc.a($$0, $$1, this.h);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.ci();
      $$1.b = $$0.K($$2);
      $$1.d = $$0.fR();
      $$1.e = $$0.x();
      $$1.f = $$0.gr();
      $$1.g = $$0.gs();
      $$1.h = $$0.t();
   }
}
