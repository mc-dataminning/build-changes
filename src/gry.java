public class gry extends gqk<cih, gye, gbp> {
   private static final alz a = alz.b("textures/entity/fox/fox.png");
   private static final alz b = alz.b("textures/entity/fox/fox_sleep.png");
   private static final alz k = alz.b("textures/entity/fox/snow_fox.png");
   private static final alz l = alz.b("textures/entity/fox/snow_fox_sleep.png");

   public gry(grq.a $$0) {
      super($$0, new gbp($$0.a(gen.aK)), new gbp($$0.a(gen.aL)), 0.4F);
      this.a(new gvr(this, $$0.b()));
   }

   protected void a(gye $$0, fgs $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.V));
      }
   }

   public alz a(gye $$0) {
      if ($$0.h == cih.v.a) {
         return $$0.d ? b : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public gye b() {
      return new gye();
   }

   public void a(cih $$0, gye $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.ci();
      $$1.b = $$0.K($$2);
      $$1.d = $$0.fR();
      $$1.e = $$0.x();
      $$1.f = $$0.go();
      $$1.g = $$0.gp();
      $$1.h = $$0.t();
   }
}
