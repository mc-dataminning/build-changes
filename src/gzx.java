public class gzx<S extends hdb, M extends gfd<S> & gdv & gfn> extends gzq<S, M> {
   private static final float a = (float) (-Math.PI / 6);
   private static final float b = (float) (Math.PI / 2);

   public gzx(gxh<S, M> $$0) {
      super($$0);
   }

   protected void a(S $$0, hes $$1, bws $$2, fiq $$3, gpd $$4, int $$5) {
      if (!$$1.c()) {
         btx $$6 = $$2 == $$0.e ? btx.a : btx.b;
         if ($$0.R && $$0.M == $$6 && $$0.H < 1.0E-5F && !$$0.aI.c()) {
            this.a($$0.aI, $$2, $$3, $$4, $$5);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   private void a(hes $$0, bws $$1, fiq $$2, gpd $$3, int $$4) {
      $$2.a();
      this.d().e().a($$2);
      gig $$5 = this.d().b();
      float $$6 = $$5.e;
      $$5.e = azk.a($$5.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$5.a($$2);
      $$5.e = $$6;
      gzd.a($$2, gzd.a.a);
      boolean $$7 = $$1 == bws.a;
      $$2.a(($$7 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      $$0.a($$2, $$3, $$4, hhp.d);
      $$2.b();
   }
}
