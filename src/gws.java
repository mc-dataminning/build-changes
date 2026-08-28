public class gws<S extends gzw, M extends gcb<S> & gav & gck> extends gwl<S, M> {
   private static final float a = (float) (-Math.PI / 6);
   private static final float b = (float) (Math.PI / 2);

   public gws(gub<S, M> $$0) {
      super($$0);
   }

   protected void a(S $$0, hbo $$1, bvb $$2, ffu $$3, gly $$4, int $$5) {
      if (!$$1.c()) {
         bsj $$6 = $$2 == $$0.e ? bsj.a : bsj.b;
         if ($$0.R && $$0.M == $$6 && $$0.H < 1.0E-5F && !$$0.aI.c()) {
            this.a($$0.aI, $$2, $$3, $$4, $$5);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   private void a(hbo $$0, bvb $$1, ffu $$2, gly $$3, int $$4) {
      $$2.a();
      this.d().e().a($$2);
      gfd $$5 = this.d().b();
      float $$6 = $$5.e;
      $$5.e = ayz.a($$5.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$5.a($$2);
      $$5.e = $$6;
      gvx.a($$2, gvx.a.a);
      boolean $$7 = $$1 == bvb.a;
      $$2.a(($$7 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      $$0.a($$2, $$3, $$4, hei.d);
      $$2.b();
   }
}
