public class gwv<S extends gzy, M extends gda<S> & gfl> extends gxs<S, M> {
   public gwv(gva<S, M> $$0) {
      super($$0);
   }

   public void a(fgr $$0, gmx $$1, int $$2, S $$3, float $$4, float $$5) {
      hcn $$6 = $$3.i;
      if (!$$6.c()) {
         $$0.a();
         this.a($$3, $$0);
         $$6.a($$0, $$1, $$2, hfh.d);
         $$0.b();
      }
   }

   protected void a(S $$0, fgr $$1) {
      this.d().a($$1);
      $$1.a(a.b.rotation(0.75F));
      $$1.b(1.07F, 1.07F, 1.07F);
      $$1.a(0.0F, 0.13F, -0.34F);
      $$1.a(a.b.rotation((float) Math.PI));
   }
}
