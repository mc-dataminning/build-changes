public class gys extends gxe<ckb, hfa, gig> {
   private static final alk a = alk.b("textures/entity/fox/fox.png");
   private static final alk j = alk.b("textures/entity/fox/fox_sleep.png");
   private static final alk k = alk.b("textures/entity/fox/snow_fox.png");
   private static final alk l = alk.b("textures/entity/fox/snow_fox_sleep.png");

   public gys(gyk.a $$0) {
      super($$0, new gig($$0.a(glf.aX)), new gig($$0.a(glf.aY)), 0.4F);
      this.a(new hcl(this));
   }

   protected void a(hfa $$0, flq $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.ab));
      }
   }

   public alk a(hfa $$0) {
      if ($$0.h == ckb.v.a) {
         return $$0.d ? j : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public hfa b() {
      return new hfa();
   }

   public void a(ckb $$0, hfa $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hfg.a($$0, $$1, this.h);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.ch();
      $$1.b = $$0.K($$2);
      $$1.d = $$0.fR();
      $$1.e = $$0.x();
      $$1.f = $$0.gu();
      $$1.g = $$0.gv();
      $$1.h = $$0.t();
   }
}
