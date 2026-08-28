public class grw extends gqi<cig, gyc, gbn> {
   private static final alz a = alz.b("textures/entity/fox/fox.png");
   private static final alz b = alz.b("textures/entity/fox/fox_sleep.png");
   private static final alz k = alz.b("textures/entity/fox/snow_fox.png");
   private static final alz l = alz.b("textures/entity/fox/snow_fox_sleep.png");

   public grw(gro.a $$0) {
      super($$0, new gbn($$0.a(gel.aK)), new gbn($$0.a(gel.aL)), 0.4F);
      this.a(new gvp(this, $$0.b()));
   }

   protected void a(gyc $$0, fgq $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.V));
      }
   }

   public alz a(gyc $$0) {
      if ($$0.h == cig.v.a) {
         return $$0.d ? b : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public gyc b() {
      return new gyc();
   }

   public void a(cig $$0, gyc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.ci();
      $$1.b = $$0.K($$2);
      $$1.d = $$0.fP();
      $$1.e = $$0.x();
      $$1.f = $$0.gm();
      $$1.g = $$0.gn();
      $$1.h = $$0.t();
   }
}
