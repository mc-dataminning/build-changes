public class gwh extends gwd<gzp, gdi> {
   private final gdi a;

   public gwh(gtl<gzp, gdi> $$0, gei $$1) {
      super($$0);
      this.a = new gdi($$1.a(gel.cM));
   }

   public void a(fgq $$0, glj $$1, int $$2, gzp $$3, float $$4, float $$5) {
      boolean $$6 = $$3.aj && $$3.u;
      if (!$$3.u || $$6) {
         fgu $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(glt.r(gts.a));
         } else {
            $$7 = $$1.getBuffer(glt.i(gts.a));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gsp.a($$3, 0.0F));
      }
   }
}
