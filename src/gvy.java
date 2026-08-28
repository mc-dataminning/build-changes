public class gvy extends gwe<gyt, gcd> {
   private final gcd a;
   private final gcd b;
   private final gvo c;

   public gvy(gtm<gyt, gcd> $$0, gej $$1, gvo $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gcd($$1.a(gem.bs));
      this.b = new gcd($$1.a(gem.br));
   }

   public void a(fgr $$0, glk $$1, int $$2, gyt $$3, float $$4, float $$5) {
      cxo $$6 = $$3.c;
      dft $$7 = $$6.a(ku.D);
      if ($$7 != null && $$7.c().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.c().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, cxo.j, dfs.k, $$2);
      }
   }

   private void a(fgr $$0, glk $$1, gyt $$2, cxo $$3, alz $$4, int $$5) {
      gcd $$6 = $$2.ae ? this.b : this.a;
      $$6.a($$2);
      this.c.a(dfr.d.f, $$4, $$6, $$3, $$0, $$1, $$5);
   }
}
