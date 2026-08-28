public class gng extends gns<cgu, fut<cgu>> {
   private final fut<cgu> a;

   public gng(glc<cgu, fut<cgu>> $$0, fxe $$1) {
      super($$0);
      this.a = new fut<>($$1.a(fxh.aq));
   }

   public void a(fag $$0, gdx $$1, int $$2, cgu $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cua $$10 = $$3.fN();
      if ($$10.g() instanceof cro $$11 && $$11.d() == cro.a.a) {
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$15;
         float $$16;
         float $$14;
         if ($$10.a(awd.by)) {
            int $$13 = cwr.a($$10, -6265536);
            $$14 = (float)axo.b.b($$13) / 255.0F;
            $$15 = (float)axo.b.c($$13) / 255.0F;
            $$16 = (float)axo.b.d($$13) / 255.0F;
         } else {
            $$14 = 1.0F;
            $$15 = 1.0F;
            $$16 = 1.0F;
         }

         fak $$20 = $$1.getBuffer(gef.e($$11.b()));
         this.a.a($$0, $$20, $$2, goz.d, $$14, $$15, $$16, 1.0F);
         return;
      }
   }
}
