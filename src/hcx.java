public class hcx<S extends hgd, M extends gic<S> & ggs & gim> extends hcq<S, M> {
   private static final float a = (float) (-Math.PI / 6);
   private static final float b = (float) (Math.PI / 2);

   public hcx(hah<S, M> $$0) {
      super($$0);
   }

   protected void a(S $$0, hhu $$1, bxn $$2, flq $$3, gsc $$4, int $$5) {
      if (!$$1.c()) {
         bus $$6 = $$2 == $$0.e ? bus.a : bus.b;
         if ($$0.R && $$0.M == $$6 && $$0.H < 1.0E-5F && !$$0.aI.c()) {
            this.a($$0.aI, $$2, $$3, $$4, $$5);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   private void a(hhu $$0, bxn $$1, flq $$2, gsc $$3, int $$4) {
      $$2.a();
      this.d().e().a($$2);
      glg $$5 = this.d().b();
      float $$6 = $$5.e;
      $$5.e = azq.a($$5.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$5.a($$2);
      $$5.e = $$6;
      hcd.a($$2, hcd.a.a);
      boolean $$7 = $$1 == bxn.a;
      $$2.a(($$7 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      $$0.a($$2, $$3, $$4, hks.d);
      $$2.b();
   }
}
