public class hci<S extends hfq, M extends ghn<S> & ggd & ghx> extends hcb<S, M> {
   private static final float a = (float) (-Math.PI / 6);
   private static final float b = (float) (Math.PI / 2);

   public hci(gzs<S, M> $$0) {
      super($$0);
   }

   protected void a(S $$0, hhi $$1, bxw $$2, fld $$3, grn $$4, int $$5) {
      if (!$$1.c()) {
         bvb $$6 = $$2 == $$0.e ? bvb.a : bvb.b;
         if ($$0.U && $$0.P == $$6 && $$0.K < 1.0E-5F && !$$0.aL.c()) {
            this.a($$0.aL, $$2, $$3, $$4, $$5);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   private void a(hhi $$0, bxw $$1, fld $$2, grn $$3, int $$4) {
      $$2.a();
      this.d().e().a($$2);
      gkr $$5 = this.d().b();
      float $$6 = $$5.e;
      $$5.e = azz.a($$5.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$5.a($$2);
      $$5.e = $$6;
      hbo.a($$2, hbo.a.a);
      boolean $$7 = $$1 == bxw.a;
      $$2.a(($$7 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      $$0.a($$2, $$3, $$4, hkg.d);
      $$2.b();
   }
}
