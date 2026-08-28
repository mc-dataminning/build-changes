public class gys<S extends hbw, M extends gea<S> & gcs & gek> extends gyl<S, M> {
   private static final float a = (float) (-Math.PI / 6);
   private static final float b = (float) (Math.PI / 2);

   public gys(gwc<S, M> $$0) {
      super($$0);
   }

   protected void a(S $$0, hdn $$1, bwk $$2, fho $$3, gny $$4, int $$5) {
      if (!$$1.c()) {
         btp $$6 = $$2 == $$0.e ? btp.a : btp.b;
         if ($$0.R && $$0.M == $$6 && $$0.H < 1.0E-5F && !$$0.aI.c()) {
            this.a($$0.aI, $$2, $$3, $$4, $$5);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   private void a(hdn $$0, bwk $$1, fho $$2, gny $$3, int $$4) {
      $$2.a();
      this.d().e().a($$2);
      ghd $$5 = this.d().b();
      float $$6 = $$5.e;
      $$5.e = azk.a($$5.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$5.a($$2);
      $$5.e = $$6;
      gxy.a($$2, gxy.a.a);
      boolean $$7 = $$1 == bwk.a;
      $$2.a(($$7 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      $$0.a($$2, $$3, $$4, hgi.d);
      $$2.b();
   }
}
