public class gvx extends gwd<gys, gcc> {
   private final gcc a;
   private final gcc b;
   private final gvn c;

   public gvx(gtl<gys, gcc> $$0, gei $$1, gvn $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gcc($$1.a(gel.bs));
      this.b = new gcc($$1.a(gel.br));
   }

   public void a(fgq $$0, glj $$1, int $$2, gys $$3, float $$4, float $$5) {
      cxo $$6 = $$3.c;
      dft $$7 = $$6.a(ku.D);
      if ($$7 != null && $$7.c().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.c().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, cxo.k, dfs.k, $$2);
      }
   }

   private void a(fgq $$0, glj $$1, gys $$2, cxo $$3, alz $$4, int $$5) {
      gcc $$6 = $$2.ae ? this.b : this.a;
      $$6.a($$2);
      this.c.a(dfr.d.f, $$4, $$6, $$3, $$0, $$1, $$5);
   }
}
