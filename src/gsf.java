public class gsf extends gsb<gvm, fzm> {
   private final fzm a;

   public gsf(gpk<gvm, fzm> $$0, gam $$1) {
      super($$0);
      this.a = new fzm($$1.a(gap.ct));
   }

   public void a(fdi $$0, ghl $$1, int $$2, gvm $$3, float $$4, float $$5) {
      boolean $$6 = $$3.aj && $$3.u;
      if (!$$3.u || $$6) {
         fdm $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(ghv.r(gpr.a));
         } else {
            $$7 = $$1.getBuffer(ghv.i(gpr.a));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gop.a($$3, 0.0F));
      }
   }
}
