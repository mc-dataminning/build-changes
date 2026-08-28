public class gqs extends gqf<chr, gxg, gat> {
   public gqs(grl.a $$0) {
      super($$0, new gat($$0.a(gei.O)), new gat($$0.a(gei.P)), 0.4F);
      this.a(new gvb(this, $$0.f()));
   }

   public alp a(gxg $$0) {
      return $$0.a;
   }

   public gxg a() {
      return new gxg();
   }

   public void a(chr $$0, gxg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gA().a().a();
      $$1.d = $$0.ci();
      $$1.e = $$0.cj();
      $$1.f = $$0.x();
      $$1.g = $$0.J($$2);
      $$1.h = $$0.K($$2);
      $$1.i = $$0.L($$2);
      $$1.b = $$0.gF();
      $$1.c = $$0.p() ? $$0.gC() : null;
   }

   protected void a(gxg $$0, fgl $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.g;
      if ($$4 > 0.0F) {
         $$1.a(0.4F * $$4, 0.15F * $$4, 0.1F * $$4);
         $$1.a(a.f.rotationDegrees(azu.i($$4, 0.0F, 90.0F)));
         if ($$0.b) {
            $$1.a(0.15F * $$4, 0.0F, 0.0F);
         }
      }
   }
}
