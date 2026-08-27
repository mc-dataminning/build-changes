public class gjy extends glz<ceh, fvb<ceh>> {
   public gjy(gkq.a $$0) {
      super($$0, new fvb<>($$0.a(fyr.u)), 0.4F);
      this.a(new goh(this, $$0.f()));
   }

   public akt a(ceh $$0) {
      return $$0.gE();
   }

   protected void a(ceh $$0, fbc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(ceh $$0, fbc $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.G($$4);
      if ($$6 > 0.0F) {
         $$1.a(0.4F * $$6, 0.15F * $$6, 0.1F * $$6);
         $$1.a(a.f.rotationDegrees(aym.j($$6, 0.0F, 90.0F)));
         ir $$7 = $$0.du();

         for (cly $$9 : $$0.dU().a(cly.class, new ewp($$7).c(2.0, 2.0, 2.0))) {
            if ($$9.fU()) {
               $$1.a(0.15F * $$6, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
