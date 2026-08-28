public class ham<S extends hdr, M extends gfq<S> & geh & gga> extends haf<S, M> {
   private static final float a = (float) (-Math.PI / 6);
   private static final float b = (float) (Math.PI / 2);

   public ham(gxw<S, M> $$0) {
      super($$0);
   }

   protected void a(S $$0, hfi $$1, bwv $$2, fjc $$3, gps $$4, int $$5) {
      if (!$$1.c()) {
         bua $$6 = $$2 == $$0.e ? bua.a : bua.b;
         if ($$0.R && $$0.M == $$6 && $$0.H < 1.0E-5F && !$$0.aI.c()) {
            this.a($$0.aI, $$2, $$3, $$4, $$5);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   private void a(hfi $$0, bwv $$1, fjc $$2, gps $$3, int $$4) {
      $$2.a();
      this.d().e().a($$2);
      giu $$5 = this.d().b();
      float $$6 = $$5.e;
      $$5.e = azm.a($$5.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$5.a($$2);
      $$5.e = $$6;
      gzs.a($$2, gzs.a.a);
      boolean $$7 = $$1 == bwv.a;
      $$2.a(($$7 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      $$0.a($$2, $$3, $$4, hif.d);
      $$2.b();
   }
}
