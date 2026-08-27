public class fyi extends gag<byf, fju<byf>> {
   public fyi(fza.a $$0) {
      super($$0, new fju<>($$0.a(fni.p)), 0.4F);
      this.a(new gcn(this, $$0.f()));
   }

   public ahh a(byf $$0) {
      return $$0.gl();
   }

   protected void a(byf $$0, eqk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(byf $$0, eqk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.D($$4);
      if ($$5 > 0.0F) {
         $$1.a(0.4F * $$5, 0.15F * $$5, 0.1F * $$5);
         $$1.a(a.f.rotationDegrees(aup.j($$5, 0.0F, 90.0F)));
         hx $$6 = $$0.dl();

         for (cfq $$8 : $$0.dL().a(cfq.class, new elx($$6).c(2.0, 2.0, 2.0))) {
            if ($$8.fD()) {
               $$1.a(0.15F * $$5, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
