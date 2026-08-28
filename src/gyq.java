public class gyq extends gxc<cjz, hey, gie> {
   private static final ali a = ali.b("textures/entity/fox/fox.png");
   private static final ali j = ali.b("textures/entity/fox/fox_sleep.png");
   private static final ali k = ali.b("textures/entity/fox/snow_fox.png");
   private static final ali l = ali.b("textures/entity/fox/snow_fox_sleep.png");

   public gyq(gyi.a $$0) {
      super($$0, new gie($$0.a(gld.aX)), new gie($$0.a(gld.aY)), 0.4F);
      this.a(new hcj(this));
   }

   protected void a(hey $$0, flo $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.ab));
      }
   }

   public ali a(hey $$0) {
      if ($$0.h == cjz.v.a) {
         return $$0.d ? j : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public hey b() {
      return new hey();
   }

   public void a(cjz $$0, hey $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hfe.a($$0, $$1, this.h);
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
