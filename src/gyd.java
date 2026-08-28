public class gyd extends gwp<ckk, hel, ghr> {
   private static final alr a = alr.b("textures/entity/fox/fox.png");
   private static final alr j = alr.b("textures/entity/fox/fox_sleep.png");
   private static final alr k = alr.b("textures/entity/fox/snow_fox.png");
   private static final alr l = alr.b("textures/entity/fox/snow_fox_sleep.png");

   public gyd(gxv.a $$0) {
      super($$0, new ghr($$0.a(gkq.aX)), new ghr($$0.a(gkq.aY)), 0.4F);
      this.a(new hbw(this));
   }

   protected void a(hel $$0, fld $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.ae));
      }
   }

   public alr a(hel $$0) {
      if ($$0.h == ckk.v.a) {
         return $$0.d ? j : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public hel b() {
      return new hel();
   }

   public void a(ckk $$0, hel $$1, float $$2) {
      super.a($$0, $$1, $$2);
      het.a($$0, $$1, this.h);
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
