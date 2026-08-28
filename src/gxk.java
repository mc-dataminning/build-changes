public class gxk<S extends gyo, M extends gda<S> & gbt> extends gxs<S, M> {
   public gxk(gva<S, M> $$0) {
      super($$0);
   }

   public void a(fgr $$0, gmx $$1, int $$2, S $$3, float $$4, float $$5) {
      this.a($$3, $$3.g, bvr.b, $$0, $$1, $$2);
      this.a($$3, $$3.i, bvr.a, $$0, $$1, $$2);
   }

   protected void a(S $$0, hcn $$1, bvr $$2, fgr $$3, gmx $$4, int $$5) {
      if (!$$1.c()) {
         $$3.a();
         this.d().a($$2, $$3);
         $$3.a(a.b.rotationDegrees(-90.0F));
         $$3.a(a.d.rotationDegrees(180.0F));
         boolean $$6 = $$2 == bvr.a;
         $$3.a((float)($$6 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         $$1.a($$3, $$4, $$5, hfh.d);
         $$3.b();
      }
   }
}
