public class hau<S extends hdz, M extends gfy<S> & geo & ggi> extends han<S, M> {
   private static final float a = (float) (-Math.PI / 6);
   private static final float b = (float) (Math.PI / 2);

   public hau(gye<S, M> $$0) {
      super($$0);
   }

   protected void a(S $$0, hfq $$1, bwx $$2, fjj $$3, gqa $$4, int $$5) {
      if (!$$1.c()) {
         buc $$6 = $$2 == $$0.e ? buc.a : buc.b;
         if ($$0.R && $$0.M == $$6 && $$0.H < 1.0E-5F && !$$0.aI.c()) {
            this.a($$0.aI, $$2, $$3, $$4, $$5);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   private void a(hfq $$0, bwx $$1, fjj $$2, gqa $$3, int $$4) {
      $$2.a();
      this.d().e().a($$2);
      gjc $$5 = this.d().b();
      float $$6 = $$5.e;
      $$5.e = azm.a($$5.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$5.a($$2);
      $$5.e = $$6;
      haa.a($$2, haa.a.a);
      boolean $$7 = $$1 == bwx.a;
      $$2.a(($$7 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      $$0.a($$2, $$3, $$4, hin.d);
      $$2.b();
   }
}
