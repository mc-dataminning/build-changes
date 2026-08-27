public class gaw<T extends cex> extends gbm<T> {
   private static final aiy a = new aiy("textures/entity/illager/evoker.png");

   public gaw(gat.a $$0) {
      super($$0, new fmp<>($$0.a(fpb.X)), 0.5F);
      this.a(new gex<T, fmp<T>>(this, $$0.d()) {
         public void a(esa $$0, fvm $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gq()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public aiy a(T $$0) {
      return a;
   }
}
