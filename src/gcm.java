public class gcm extends gcy<bzz, fki<bzz>> {
   private final fki<bzz> a;

   public gcm(gai<bzz, fki<bzz>> $$0, fmt $$1) {
      super($$0);
      this.a = new fki<>($$1.a(fmw.an));
   }

   public void a(eqb $$0, fth $$1, int $$2, bzz $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cmy $$10 = $$3.u();
      if ($$10.d() instanceof cmo) {
         cmo $$11 = (cmo)$$10.d();
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$13;
         float $$14;
         float $$15;
         if ($$11 instanceof clp) {
            int $$12 = ((clp)$$11).e_($$10);
            $$13 = (float)($$12 >> 16 & 0xFF) / 255.0F;
            $$14 = (float)($$12 >> 8 & 0xFF) / 255.0F;
            $$15 = (float)($$12 & 0xFF) / 255.0F;
         } else {
            $$13 = 1.0F;
            $$14 = 1.0F;
            $$15 = 1.0F;
         }

         eqf $$19 = $$1.getBuffer(ftp.e($$11.h()));
         this.a.a($$0, $$19, $$2, gee.d, $$13, $$14, $$15, 1.0F);
      }
   }
}
