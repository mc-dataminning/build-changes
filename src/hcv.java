public class hcv<S extends hgb, M extends gia<S> & ggq & gik> extends hco<S, M> {
   private static final float a = (float) (-Math.PI / 6);
   private static final float b = (float) (Math.PI / 2);

   public hcv(haf<S, M> $$0) {
      super($$0);
   }

   protected void a(S $$0, hhs $$1, bxl $$2, flo $$3, gsa $$4, int $$5) {
      if (!$$1.c()) {
         buq $$6 = $$2 == $$0.e ? buq.a : buq.b;
         if ($$0.R && $$0.M == $$6 && $$0.H < 1.0E-5F && !$$0.aI.c()) {
            this.a($$0.aI, $$2, $$3, $$4, $$5);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   private void a(hhs $$0, bxl $$1, flo $$2, gsa $$3, int $$4) {
      $$2.a();
      this.d().e().a($$2);
      gle $$5 = this.d().b();
      float $$6 = $$5.e;
      $$5.e = azo.a($$5.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$5.a($$2);
      $$5.e = $$6;
      hcb.a($$2, hcb.a.a);
      boolean $$7 = $$1 == bxl.a;
      $$2.a(($$7 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      $$0.a($$2, $$3, $$4, hkq.d);
      $$2.b();
   }
}
