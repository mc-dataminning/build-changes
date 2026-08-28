public class gqv extends gqi<chz, gxj, gaw> {
   public gqv(gro.a $$0) {
      super($$0, new gaw($$0.a(gel.L)), new gaw($$0.a(gel.M)), 0.4F);
      this.a(new gve(this, $$0.f()));
   }

   public alz a(gxj $$0) {
      return $$0.a;
   }

   public gxj a() {
      return new gxj();
   }

   public void a(chz $$0, gxj $$1, float $$2) {
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

   protected void a(gxj $$0, fgq $$1, float $$2, float $$3) {
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
