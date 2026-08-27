public class gbg extends gde<cap, fmp<cap>> {
   public gbg(gby.a $$0) {
      super($$0, new fmp<>($$0.a(fqe.p)), 0.4F);
      this.a(new gfl(this, $$0.f()));
   }

   public ajc a(cap $$0) {
      return $$0.gr();
   }

   protected void a(cap $$0, etd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(cap $$0, etd $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.E($$4);
      if ($$6 > 0.0F) {
         $$1.a(0.4F * $$6, 0.15F * $$6, 0.1F * $$6);
         $$1.a(a.f.rotationDegrees(awm.j($$6, 0.0F, 90.0F)));
         ib $$7 = $$0.dj();

         for (cia $$9 : $$0.dJ().a(cia.class, new eoq($$7).c(2.0, 2.0, 2.0))) {
            if ($$9.fF()) {
               $$1.a(0.15F * $$6, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
