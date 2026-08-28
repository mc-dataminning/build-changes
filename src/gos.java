public class gos extends gnf<chb, guw, fyn> {
   private static final ali a = ali.b("textures/entity/fox/fox.png");
   private static final ali b = ali.b("textures/entity/fox/fox_sleep.png");
   private static final ali k = ali.b("textures/entity/fox/snow_fox.png");
   private static final ali l = ali.b("textures/entity/fox/snow_fox_sleep.png");

   public gos(gok.a $$0) {
      super($$0, new fyn($$0.a(gbl.az)), new fyn($$0.a(gbl.aA)), 0.4F);
      this.a(new gsk(this, $$0.b()));
   }

   protected void a(guw $$0, feb $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.V));
      }
   }

   public ali a(guw $$0) {
      if ($$0.h == chb.v.a) {
         return $$0.d ? b : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public guw c() {
      return new guw();
   }

   public void a(chb $$0, guw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.cj();
      $$1.b = $$0.K($$2);
      $$1.d = $$0.fT();
      $$1.e = $$0.y();
      $$1.f = $$0.gu();
      $$1.g = $$0.gv();
      $$1.h = $$0.t();
   }
}
