public class gio extends gkm<cer, ftt<cer>> {
   public gio(gjg.a $$0) {
      super($$0, new ftt<>($$0.a(fxh.t)), 0.4F);
      this.a(new gmu(this, $$0.f()));
   }

   public akk a(cer $$0) {
      return $$0.gt();
   }

   protected void a(cer $$0, fag $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(cer $$0, fag $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.H($$4);
      if ($$6 > 0.0F) {
         $$1.a(0.4F * $$6, 0.15F * $$6, 0.1F * $$6);
         $$1.a(a.f.rotationDegrees(aye.j($$6, 0.0F, 90.0F)));
         ja $$7 = $$0.dp();

         for (cmh $$9 : $$0.dP().a(cmh.class, new evu($$7).c(2.0, 2.0, 2.0))) {
            if ($$9.fH()) {
               $$1.a(0.15F * $$6, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
