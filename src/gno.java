public class gno extends goa<cgy, fvb<cgy>> {
   private final fvb<cgy> a;

   public gno(glk<cgy, fvb<cgy>> $$0, fxm $$1) {
      super($$0);
      this.a = new fvb<>($$1.a(fxp.aq));
   }

   public void a(fao $$0, gef $$1, int $$2, cgy $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cud $$10 = $$3.fO();
      if ($$10.g() instanceof crs $$11 && $$11.d() == crs.a.a) {
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$15;
         float $$16;
         float $$14;
         if ($$10.a(awf.by)) {
            int $$13 = cwu.a($$10, -6265536);
            $$14 = (float)axq.b.b($$13) / 255.0F;
            $$15 = (float)axq.b.c($$13) / 255.0F;
            $$16 = (float)axq.b.d($$13) / 255.0F;
         } else {
            $$14 = 1.0F;
            $$15 = 1.0F;
            $$16 = 1.0F;
         }

         fas $$20 = $$1.getBuffer(gen.e($$11.b()));
         this.a.a($$0, $$20, $$2, gph.d, $$14, $$15, $$16, 1.0F);
         return;
      }
   }
}
