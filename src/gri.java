public class gri extends gqv<cgz, gxx, gbk> {
   public gri(gsb.a $$0) {
      super($$0, new gbk($$0.a(gez.O)), new gbk($$0.a(gez.P)), 0.4F);
      this.a(new gvr(this, $$0.f()));
   }

   public aku a(gxx $$0) {
      return $$0.a;
   }

   public gxx a() {
      return new gxx();
   }

   public void a(cgz $$0, gxx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gB().a().a();
      $$1.d = $$0.ci();
      $$1.e = $$0.cj();
      $$1.f = $$0.x();
      $$1.g = $$0.J($$2);
      $$1.h = $$0.K($$2);
      $$1.i = $$0.L($$2);
      $$1.b = $$0.gG();
      $$1.c = $$0.p() ? $$0.gD() : null;
   }

   protected void a(gxx $$0, ffs $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.g;
      if ($$4 > 0.0F) {
         $$1.a(0.4F * $$4, 0.15F * $$4, 0.1F * $$4);
         $$1.a(a.f.rotationDegrees(ayy.i($$4, 0.0F, 90.0F)));
         if ($$0.b) {
            $$1.a(0.15F * $$4, 0.0F, 0.0F);
         }
      }
   }
}
