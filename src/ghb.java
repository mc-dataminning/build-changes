public class ghb extends giz<ceh, fsh<ceh>> {
   public ghb(ght.a $$0) {
      super($$0, new fsh<>($$0.a(fvv.t)), 0.4F);
      this.a(new glh(this, $$0.f()));
   }

   public akm a(ceh $$0) {
      return $$0.gv();
   }

   protected void a(ceh $$0, eys $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(ceh $$0, eys $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = $$0.G($$4);
      if ($$6 > 0.0F) {
         $$1.a(0.4F * $$6, 0.15F * $$6, 0.1F * $$6);
         $$1.a(a.f.rotationDegrees(ayd.j($$6, 0.0F, 90.0F)));
         io $$7 = $$0.dp();

         for (clw $$9 : $$0.dP().a(clw.class, new euf($$7).c(2.0, 2.0, 2.0))) {
            if ($$9.fL()) {
               $$1.a(0.15F * $$6, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
