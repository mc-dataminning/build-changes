public class gez extends ggx<ccl, fqg<ccl>> {
   public gez(gfr.a $$0) {
      super($$0, new fqg<>($$0.a(ftu.t)), 0.4F);
      this.a(new gje(this, $$0.f()));
   }

   public ajv a(ccl $$0) {
      return $$0.gt();
   }

   protected void a(ccl $$0, ewr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(ccl $$0, ewr $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.G($$4);
      if ($$6 > 0.0F) {
         $$1.a(0.4F * $$6, 0.15F * $$6, 0.1F * $$6);
         $$1.a(a.f.rotationDegrees(axm.j($$6, 0.0F, 90.0F)));
         id $$7 = $$0.dm();

         for (cka $$9 : $$0.dM().a(cka.class, new ese($$7).c(2.0, 2.0, 2.0))) {
            if ($$9.fI()) {
               $$1.a(0.15F * $$6, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
