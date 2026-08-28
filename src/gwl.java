public class gwl<S extends gxp, M extends gcb<S> & gav> extends gwt<S, M> {
   public gwl(gub<S, M> $$0) {
      super($$0);
   }

   public void a(ffu $$0, gly $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$3, $$3.g, bvb.b, $$0, $$1, $$2);
      this.a($$3, $$3.i, bvb.a, $$0, $$1, $$2);
   }

   protected void a(S $$0, hbo $$1, bvb $$2, ffu $$3, gly $$4, int $$5) {
      if (!$$1.c()) {
         $$3.a();
         this.d().a($$2, $$3);
         $$3.a(a.b.rotationDegrees(-90.0F));
         $$3.a(a.d.rotationDegrees(180.0F));
         boolean $$6 = $$2 == bvb.a;
         $$3.a((float)($$6 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         $$1.a($$3, $$4, $$5, hei.d);
         $$3.b();
      }
   }
}
