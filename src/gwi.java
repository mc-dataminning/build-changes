public class gwi extends gwe<gzq, gdj> {
   private final gdj a;

   public gwi(gtm<gzq, gdj> $$0, gej $$1) {
      super($$0);
      this.a = new gdj($$1.a(gem.cM));
   }

   public void a(fgr $$0, glk $$1, int $$2, gzq $$3, float $$4, float $$5) {
      boolean $$6 = $$3.aj && $$3.u;
      if (!$$3.u || $$6) {
         fgv $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(glu.s(gtt.a));
         } else {
            $$7 = $$1.getBuffer(glu.j(gtt.a));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gsq.a($$3, 0.0F));
      }
   }
}
