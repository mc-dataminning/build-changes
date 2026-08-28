public class giu extends gks<ceu, ftz<ceu>> {
   public giu(gjm.a $$0) {
      super($$0, new ftz<>($$0.a(fxn.t)), 0.4F);
      this.a(new gna(this, $$0.f()));
   }

   public akk a(ceu $$0) {
      return $$0.gu();
   }

   protected void a(ceu $$0, fam $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(ceu $$0, fam $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.H($$4);
      if ($$6 > 0.0F) {
         $$1.a(0.4F * $$6, 0.15F * $$6, 0.1F * $$6);
         $$1.a(a.f.rotationDegrees(ayg.j($$6, 0.0F, 90.0F)));
         ja $$7 = $$0.dq();

         for (cmk $$9 : $$0.dQ().a(cmk.class, new ewa($$7).c(2.0, 2.0, 2.0))) {
            if ($$9.fI()) {
               $$1.a(0.15F * $$6, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
