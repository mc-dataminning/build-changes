public class gxr<S extends hav, M extends gda<S> & gbt & gdj> extends gxk<S, M> {
   private static final float a = (float) (-Math.PI / 6);
   private static final float b = (float) (Math.PI / 2);

   public gxr(gva<S, M> $$0) {
      super($$0);
   }

   protected void a(S $$0, hcn $$1, bvr $$2, fgr $$3, gmx $$4, int $$5) {
      if (!$$1.c()) {
         bsx $$6 = $$2 == $$0.e ? bsx.a : bsx.b;
         if ($$0.R && $$0.M == $$6 && $$0.H < 1.0E-5F && !$$0.aI.c()) {
            this.a($$0.aI, $$2, $$3, $$4, $$5);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   private void a(hcn $$0, bvr $$1, fgr $$2, gmx $$3, int $$4) {
      $$2.a();
      this.d().e().a($$2);
      ggc $$5 = this.d().b();
      float $$6 = $$5.e;
      $$5.e = ayz.a($$5.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$5.a($$2);
      $$5.e = $$6;
      gww.a($$2, gww.a.a);
      boolean $$7 = $$1 == bvr.a;
      $$2.a(($$7 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      $$0.a($$2, $$3, $$4, hfh.d);
      $$2.b();
   }
}
