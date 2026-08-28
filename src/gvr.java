public class gvr extends gwe<gyj, gbw> {
   private final gbw a;
   private final gbw b;
   private final gvo c;

   public gvr(gtm<gyj, gbw> $$0, gej $$1, gvo $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gbw($$1.a(gem.bb));
      this.b = new gbw($$1.a(gem.bd));
   }

   public void a(fgr $$0, glk $$1, int $$2, gyj $$3, float $$4, float $$5) {
      cxo $$6 = $$3.i;
      dft $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         gbw $$8 = $$3.ae ? this.b : this.a;
         alz $$9 = $$7.c().get();
         $$8.a($$3);
         this.c.a(dfr.d.e, $$9, $$8, $$6, $$0, $$1, $$2);
      }
   }
}
