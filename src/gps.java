public class gps extends gof<chi, gvx, fzm> {
   private static final alj a = alj.b("textures/entity/fox/fox.png");
   private static final alj b = alj.b("textures/entity/fox/fox_sleep.png");
   private static final alj k = alj.b("textures/entity/fox/snow_fox.png");
   private static final alj l = alj.b("textures/entity/fox/snow_fox_sleep.png");

   public gps(gpk.a $$0) {
      super($$0, new fzm($$0.a(gck.aJ)), new fzm($$0.a(gck.aK)), 0.4F);
      this.a(new gtl(this, $$0.b()));
   }

   protected void a(gvx $$0, fer $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.V));
      }
   }

   public alj a(gvx $$0) {
      if ($$0.h == chi.v.a) {
         return $$0.d ? b : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public gvx b() {
      return new gvx();
   }

   public void a(chi $$0, gvx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.ci();
      $$1.b = $$0.K($$2);
      $$1.d = $$0.fP();
      $$1.e = $$0.v();
      $$1.f = $$0.gm();
      $$1.g = $$0.gn();
      $$1.h = $$0.q();
   }
}
