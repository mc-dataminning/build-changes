public class gnr extends gme<cgk, gtu, fxn> {
   private static final alc a = alc.b("textures/entity/fox/fox.png");
   private static final alc b = alc.b("textures/entity/fox/fox_sleep.png");
   private static final alc k = alc.b("textures/entity/fox/snow_fox.png");
   private static final alc l = alc.b("textures/entity/fox/snow_fox_sleep.png");

   public gnr(gnj.a $$0) {
      super($$0, new fxn($$0.a(gak.az)), new fxn($$0.a(gak.aA)), 0.4F);
      this.a(new grj(this, $$0.b()));
   }

   protected void a(gtu $$0, fde $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.V));
      }
   }

   public alc a(gtu $$0) {
      if ($$0.h == cgk.v.a) {
         return $$0.d ? b : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public gtu c() {
      return new gtu();
   }

   public void a(cgk $$0, gtu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.cf();
      $$1.b = $$0.K($$2);
      $$1.d = $$0.fM();
      $$1.e = $$0.y();
      $$1.f = $$0.gp();
      $$1.g = $$0.gq();
      $$1.h = $$0.t();
   }
}
