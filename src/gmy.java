public class gmy extends gnk<chm, fum<chm>> {
   private final fum<chm> a;

   public gmy(gku<chm, fum<chm>> $$0, fwx $$1) {
      super($$0);
      this.a = new fum<>($$1.a(fxa.aq));
   }

   public void a(ezz $$0, gdp $$1, int $$2, chm $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cuq $$10 = $$3.fR();
      if ($$10.g() instanceof cse $$11 && $$11.d() == cse.a.a) {
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$15;
         float $$16;
         float $$14;
         if ($$10.a(awy.by)) {
            int $$13 = cxi.a($$10, -6265536);
            $$14 = (float)ayj.b.b($$13) / 255.0F;
            $$15 = (float)ayj.b.c($$13) / 255.0F;
            $$16 = (float)ayj.b.d($$13) / 255.0F;
         } else {
            $$14 = 1.0F;
            $$15 = 1.0F;
            $$16 = 1.0F;
         }

         fad $$20 = $$1.getBuffer(gdx.e($$11.b()));
         this.a.a($$0, $$20, $$2, gor.d, $$14, $$15, $$16, 1.0F);
         return;
      }
   }
}
