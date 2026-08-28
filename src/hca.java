public class hca<S extends hfe, M extends gia<S> & gkm> extends hcw<S, M> {
   public hca(haf<S, M> $$0) {
      super($$0);
   }

   public void a(flo $$0, gsa $$1, int $$2, S $$3, float $$4, float $$5) {
      hhs $$6 = $$3.i;
      if (!$$6.c()) {
         $$0.a();
         this.a($$3, $$0);
         $$6.a($$0, $$1, $$2, hkq.d);
         $$0.b();
      }
   }

   protected void a(S $$0, flo $$1) {
      this.d().a($$1);
      $$1.a(a.b.rotation(0.75F));
      $$1.b(1.07F, 1.07F, 1.07F);
      $$1.a(0.0F, 0.13F, -0.34F);
      $$1.a(a.b.rotation((float) Math.PI));
   }
}
