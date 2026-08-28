public class goh extends gmu<cgw, gul, fyc> {
   private static final alh a = alh.b("textures/entity/fox/fox.png");
   private static final alh b = alh.b("textures/entity/fox/fox_sleep.png");
   private static final alh k = alh.b("textures/entity/fox/snow_fox.png");
   private static final alh l = alh.b("textures/entity/fox/snow_fox_sleep.png");

   public goh(gnz.a $$0) {
      super($$0, new fyc($$0.a(gba.az)), new fyc($$0.a(gba.aA)), 0.4F);
      this.a(new grz(this, $$0.b()));
   }

   protected void a(gul $$0, fdt $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.V));
      }
   }

   public alh a(gul $$0) {
      if ($$0.h == cgw.v.a) {
         return $$0.d ? b : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public gul c() {
      return new gul();
   }

   public void a(cgw $$0, gul $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.cj();
      $$1.b = $$0.K($$2);
      $$1.d = $$0.fT();
      $$1.e = $$0.y();
      $$1.f = $$0.gv();
      $$1.g = $$0.gw();
      $$1.h = $$0.t();
   }
}
