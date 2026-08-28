public class grr extends gqd<cic, gxx, gbi> {
   private static final alz a = alz.b("textures/entity/fox/fox.png");
   private static final alz b = alz.b("textures/entity/fox/fox_sleep.png");
   private static final alz k = alz.b("textures/entity/fox/snow_fox.png");
   private static final alz l = alz.b("textures/entity/fox/snow_fox_sleep.png");

   public grr(grj.a $$0) {
      super($$0, new gbi($$0.a(geg.aK)), new gbi($$0.a(geg.aL)), 0.4F);
      this.a(new gvk(this, $$0.b()));
   }

   protected void a(gxx $$0, fgl $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.V));
      }
   }

   public alz a(gxx $$0) {
      if ($$0.h == cic.v.a) {
         return $$0.d ? b : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public gxx b() {
      return new gxx();
   }

   public void a(cic $$0, gxx $$1, float $$2) {
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
