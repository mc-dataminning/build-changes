public class gwt<S extends gzx, M extends gcc<S> & gaw & gcl> extends gwm<S, M> {
   private static final float a = (float) (-Math.PI / 6);
   private static final float b = (float) (Math.PI / 2);

   public gwt(guc<S, M> $$0) {
      super($$0);
   }

   protected void a(S $$0, hbp $$1, bvc $$2, ffv $$3, glz $$4, int $$5) {
      if (!$$1.c()) {
         bsk $$6 = $$2 == $$0.e ? bsk.a : bsk.b;
         if ($$0.R && $$0.M == $$6 && $$0.H < 1.0E-5F && !$$0.aI.c()) {
            this.a($$0.aI, $$2, $$3, $$4, $$5);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   private void a(hbp $$0, bvc $$1, ffv $$2, glz $$3, int $$4) {
      $$2.a();
      this.d().e().a($$2);
      gfe $$5 = this.d().b();
      float $$6 = $$5.e;
      $$5.e = ayz.a($$5.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$5.a($$2);
      $$5.e = $$6;
      gvy.a($$2, gvy.a.a);
      boolean $$7 = $$1 == bvc.a;
      $$2.a(($$7 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      $$0.a($$2, $$3, $$4, hej.d);
      $$2.b();
   }
}
