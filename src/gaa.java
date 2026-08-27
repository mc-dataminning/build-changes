public class gaa extends gby<bzw, flm<bzw>> {
   public gaa(gas.a $$0) {
      super($$0, new flm<>($$0.a(fpb.p)), 0.4F);
      this.a(new gef(this, $$0.f()));
   }

   public aiy a(bzw $$0) {
      return $$0.gm();
   }

   protected void a(bzw $$0, esa $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(bzw $$0, esa $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.E($$4);
      if ($$6 > 0.0F) {
         $$1.a(0.4F * $$6, 0.15F * $$6, 0.1F * $$6);
         $$1.a(a.f.rotationDegrees(awh.j($$6, 0.0F, 90.0F)));
         hz $$7 = $$0.dm();

         for (chh $$9 : $$0.dM().a(chh.class, new enn($$7).c(2.0, 2.0, 2.0))) {
            if ($$9.fD()) {
               $$1.a(0.15F * $$6, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
