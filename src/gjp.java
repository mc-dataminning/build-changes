public class gjp extends gln<cfh, fut<cfh>> {
   public gjp(gkh.a $$0) {
      super($$0, new fut<>($$0.a(fyh.u)), 0.4F);
      this.a(new gnv(this, $$0.f()));
   }

   public akr a(cfh $$0) {
      return $$0.gv();
   }

   protected void a(cfh $$0, fbg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(cfh $$0, fbg $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.H($$4);
      if ($$6 > 0.0F) {
         $$1.a(0.4F * $$6, 0.15F * $$6, 0.1F * $$6);
         $$1.a(a.f.rotationDegrees(ayo.j($$6, 0.0F, 90.0F)));
         jd $$7 = $$0.dp();

         for (cmx $$9 : $$0.dP().a(cmx.class, new ewv($$7).c(2.0, 2.0, 2.0))) {
            if ($$9.fI()) {
               $$1.a(0.15F * $$6, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
