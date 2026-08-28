public class gqq extends gqd<chv, gxe, gar> {
   public gqq(grj.a $$0) {
      super($$0, new gar($$0.a(geg.L)), new gar($$0.a(geg.M)), 0.4F);
      this.a(new guz(this, $$0.f()));
   }

   public alz a(gxe $$0) {
      return $$0.a;
   }

   public gxe a() {
      return new gxe();
   }

   public void a(chv $$0, gxe $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gy().a().a();
      $$1.d = $$0.ci();
      $$1.e = $$0.cj();
      $$1.f = $$0.x();
      $$1.g = $$0.J($$2);
      $$1.h = $$0.K($$2);
      $$1.i = $$0.L($$2);
      $$1.b = $$0.gD();
      $$1.c = $$0.p() ? $$0.gA() : null;
   }

   protected void a(gxe $$0, fgl $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.g;
      if ($$4 > 0.0F) {
         $$1.a(0.4F * $$4, 0.15F * $$4, 0.1F * $$4);
         $$1.a(a.f.rotationDegrees(bae.i($$4, 0.0F, 90.0F)));
         if ($$0.b) {
            $$1.a(0.15F * $$4, 0.0F, 0.0F);
         }
      }
   }
}
