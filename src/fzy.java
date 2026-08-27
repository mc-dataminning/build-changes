public class fzy extends gak<byx, fif<byx>> {
   private final fif<byx> a;

   public fzy(fxx<byx, fif<byx>> $$0, fkp $$1) {
      super($$0);
      this.a = new fif<>($$1.a(fks.ak));
   }

   public void a(eob $$0, fqz $$1, int $$2, byx $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      clo $$10 = $$3.u();
      if ($$10.d() instanceof cle) {
         cle $$11 = (cle)$$10.d();
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$13;
         float $$14;
         float $$15;
         if ($$11 instanceof ckf) {
            int $$12 = ((ckf)$$11).e_($$10);
            $$13 = (float)($$12 >> 16 & 0xFF) / 255.0F;
            $$14 = (float)($$12 >> 8 & 0xFF) / 255.0F;
            $$15 = (float)($$12 & 0xFF) / 255.0F;
         } else {
            $$13 = 1.0F;
            $$14 = 1.0F;
            $$15 = 1.0F;
         }

         eof $$19 = $$1.getBuffer(frh.e($$11.h()));
         this.a.a($$0, $$19, $$2, gbq.d, $$13, $$14, $$15, 1.0F);
      }
   }
}
