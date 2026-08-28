public class haq<S extends hdu, M extends ggp<S> & gjb> extends hbm<S, M> {
   public haq(gyv<S, M> $$0) {
      super($$0);
   }

   public void a(fkd $$0, gqr $$1, int $$2, S $$3, float $$4, float $$5) {
      hgi $$6 = $$3.i;
      if (!$$6.c()) {
         $$0.a();
         this.a($$3, $$0);
         $$6.a($$0, $$1, $$2, hjg.d);
         $$0.b();
      }
   }

   protected void a(S $$0, fkd $$1) {
      this.d().a($$1);
      $$1.a(a.b.rotation(0.75F));
      $$1.b(1.07F, 1.07F, 1.07F);
      $$1.a(0.0F, 0.13F, -0.34F);
      $$1.a(a.b.rotation((float) Math.PI));
   }
}
