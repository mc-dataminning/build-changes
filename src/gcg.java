public class gcg extends gee<cbg, fnn<cbg>> {
   public gcg(gcy.a $$0) {
      super($$0, new fnn<>($$0.a(frc.p)), 0.4F);
      this.a(new ggl(this, $$0.f()));
   }

   public ajh a(cbg $$0) {
      return $$0.gt();
   }

   protected void a(cbg $$0, etz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(cbg $$0, etz $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.G($$4);
      if ($$6 > 0.0F) {
         $$1.a(0.4F * $$6, 0.15F * $$6, 0.1F * $$6);
         $$1.a(a.f.rotationDegrees(aww.j($$6, 0.0F, 90.0F)));
         ib $$7 = $$0.dm();

         for (cis $$9 : $$0.dM().a(cis.class, new epm($$7).c(2.0, 2.0, 2.0))) {
            if ($$9.fI()) {
               $$1.a(0.15F * $$6, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
