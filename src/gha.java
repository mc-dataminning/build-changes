public class gha extends ghm<cdi, fop<cdi>> {
   private final fop<cdi> a;

   public gha(gew<cdi, fop<cdi>> $$0, frb $$1) {
      super($$0);
      this.a = new fop<>($$1.a(fre.aq));
   }

   public void a(eub $$0, fxs $$1, int $$2, cdi $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cqm $$10 = $$3.fP();
      if ($$10.d() instanceof cnx $$11 && $$11.c() == cnx.a.a) {
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$15;
         float $$16;
         float $$14;
         if ($$10.a(auv.ba)) {
            int $$13 = cpf.b($$10);
            $$14 = (float)($$13 >> 16 & 0xFF) / 255.0F;
            $$15 = (float)($$13 >> 8 & 0xFF) / 255.0F;
            $$16 = (float)($$13 & 0xFF) / 255.0F;
         } else {
            $$14 = 1.0F;
            $$15 = 1.0F;
            $$16 = 1.0F;
         }

         euf $$20 = $$1.getBuffer(fya.e($$11.b()));
         this.a.a($$0, $$20, $$2, git.d, $$14, $$15, $$16, 1.0F);
         return;
      }
   }
}
