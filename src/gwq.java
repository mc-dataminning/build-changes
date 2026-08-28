public class gwq<S extends gzu, M extends gca<S> & gau & gcj> extends gwj<S, M> {
   private static final float a = (float) (-Math.PI / 6);
   private static final float b = (float) (Math.PI / 2);

   public gwq(gtz<S, M> $$0) {
      super($$0);
   }

   protected void a(S $$0, hbl $$1, bva $$2, ffu $$3, glx $$4, int $$5) {
      if (!$$1.c()) {
         if ($$0.H < 1.0E-5F && $$0.e == $$2 && !$$0.aI.c()) {
            this.a($$0.aI, $$2, $$3, $$4, $$5);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   private void a(hbl $$0, bva $$1, ffu $$2, glx $$3, int $$4) {
      $$2.a();
      this.d().e().a($$2);
      gfc $$5 = this.d().b();
      float $$6 = $$5.e;
      $$5.e = ayz.a($$5.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$5.a($$2);
      $$5.e = $$6;
      gvv.a($$2, gvv.a.a);
      boolean $$7 = $$1 == bva.a;
      $$2.a(($$7 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      $$0.a($$2, $$3, $$4, hea.d);
      $$2.b();
   }
}
