public class hbl<S extends her, M extends ggp<S> & gff & ggz> extends hbe<S, M> {
   private static final float a = (float) (-Math.PI / 6);
   private static final float b = (float) (Math.PI / 2);

   public hbl(gyv<S, M> $$0) {
      super($$0);
   }

   protected void a(S $$0, hgi $$1, bxa $$2, fkd $$3, gqr $$4, int $$5) {
      if (!$$1.c()) {
         buf $$6 = $$2 == $$0.e ? buf.a : buf.b;
         if ($$0.R && $$0.M == $$6 && $$0.H < 1.0E-5F && !$$0.aI.c()) {
            this.a($$0.aI, $$2, $$3, $$4, $$5);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   private void a(hgi $$0, bxa $$1, fkd $$2, gqr $$3, int $$4) {
      $$2.a();
      this.d().e().a($$2);
      gjt $$5 = this.d().b();
      float $$6 = $$5.e;
      $$5.e = azm.a($$5.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$5.a($$2);
      $$5.e = $$6;
      har.a($$2, har.a.a);
      boolean $$7 = $$1 == bxa.a;
      $$2.a(($$7 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      $$0.a($$2, $$3, $$4, hjg.d);
      $$2.b();
   }
}
