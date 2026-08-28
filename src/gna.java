public class gna extends gln<cgf, gtd, fxd> {
   private static final alb a = alb.b("textures/entity/fox/fox.png");
   private static final alb b = alb.b("textures/entity/fox/fox_sleep.png");
   private static final alb k = alb.b("textures/entity/fox/snow_fox.png");
   private static final alb l = alb.b("textures/entity/fox/snow_fox_sleep.png");

   public gna(gms.a $$0) {
      super($$0, new fxd($$0.a(gaa.az)), new fxd($$0.a(gaa.aA)), 0.4F);
      this.a(new gqs(this, $$0.b()));
   }

   protected void a(gtd $$0, fcu $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.V));
      }
   }

   public alb a(gtd $$0) {
      if ($$0.h == cgf.v.a) {
         return $$0.d ? b : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public gtd c() {
      return new gtd();
   }

   public void a(cgf $$0, gtd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.cf();
      $$1.b = $$0.K($$2);
      $$1.d = $$0.fL();
      $$1.e = $$0.y();
      $$1.f = $$0.go();
      $$1.g = $$0.gp();
      $$1.h = $$0.t();
   }
}
