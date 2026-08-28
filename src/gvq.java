public class gvq extends gwd<gyi, gbv> {
   private final gbv a;
   private final gbv b;
   private final gvn c;

   public gvq(gtl<gyi, gbv> $$0, gei $$1, gvn $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gbv($$1.a(gel.bb));
      this.b = new gbv($$1.a(gel.bd));
   }

   public void a(fgq $$0, glj $$1, int $$2, gyi $$3, float $$4, float $$5) {
      cxo $$6 = $$3.i;
      dft $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         gbv $$8 = $$3.ae ? this.b : this.a;
         alz $$9 = $$7.c().get();
         $$8.a($$3);
         this.c.a(dfr.d.e, $$9, $$8, $$6, $$0, $$1, $$2);
      }
   }
}
