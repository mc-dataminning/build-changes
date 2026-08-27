public class fzt<T extends bki & blo, M extends fhc<T>> extends fzs<T, M> {
   private final agg a;
   private final M b;

   public fzt(fxf<T, M> $$0, M $$1, agg $$2) {
      super($$0);
      this.b = $$1;
      this.a = $$2;
   }

   @Override
   public void a(enk $$0, fqh $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.i()) {
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$6);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         eno $$10 = $$1.getBuffer(fqp.e(this.a));
         this.b.a($$0, $$10, $$2, gay.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
