public class geq extends ggo<ccg, fpx<ccg>> {
   public geq(gfi.a $$0) {
      super($$0, new fpx<>($$0.a(ftl.t)), 0.4F);
      this.a(new giv(this, $$0.f()));
   }

   public ajt a(ccg $$0) {
      return $$0.gt();
   }

   protected void a(ccg $$0, ewi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(ccg $$0, ewi $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.G($$4);
      if ($$6 > 0.0F) {
         $$1.a(0.4F * $$6, 0.15F * $$6, 0.1F * $$6);
         $$1.a(a.f.rotationDegrees(axk.j($$6, 0.0F, 90.0F)));
         ib $$7 = $$0.dm();

         for (cjt $$9 : $$0.dM().a(cjt.class, new erv($$7).c(2.0, 2.0, 2.0))) {
            if ($$9.fI()) {
               $$1.a(0.15F * $$6, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
