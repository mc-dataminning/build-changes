public class gwp<S extends gzt, M extends gby<S> & gas & gch> extends gwi<S, M> {
   private static final float a = (float) (-Math.PI / 6);
   private static final float b = (float) (Math.PI / 2);

   public gwp(gty<S, M> $$0) {
      super($$0);
   }

   protected void a(S $$0, hbk $$1, buz $$2, ffs $$3, glv $$4, int $$5) {
      if (!$$1.c()) {
         if ($$0.H < 1.0E-5F && $$0.e == $$2 && !$$0.aI.c()) {
            this.a($$0.aI, $$2, $$3, $$4, $$5);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   private void a(hbk $$0, buz $$1, ffs $$2, glv $$3, int $$4) {
      $$2.a();
      this.d().e().a($$2);
      gfa $$5 = this.d().b();
      float $$6 = $$5.e;
      $$5.e = ayy.a($$5.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$5.a($$2);
      $$5.e = $$6;
      gvu.a($$2, gvu.a.a);
      boolean $$7 = $$1 == buz.a;
      $$2.a(($$7 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      $$0.a($$2, $$3, $$4, hec.d);
      $$2.b();
   }
}
