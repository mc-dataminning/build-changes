public class gkz<T extends bql & brt, M extends frr<T>> extends gky<T, M> {
   private final akf a;
   private final M b;

   public gkz(gii<T, M> $$0, M $$1, akf $$2) {
      super($$0);
      this.b = $$1;
      this.a = $$2;
   }

   @Override
   public void a(exn $$0, gbe $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.i()) {
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$6);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         exr $$10 = $$1.getBuffer(gbm.e(this.a));
         this.b.a($$0, $$10, $$2, gmf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
