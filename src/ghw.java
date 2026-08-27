public class ghw<T extends cjo> extends gim<T> {
   private static final akn a = new akn("textures/entity/illager/evoker.png");

   public ghw(ght.a $$0) {
      super($$0, new ftk<>($$0.a(fvv.ab)), 0.5F);
      this.a(new gly<T, ftk<T>>(this, $$0.d()) {
         public void a(eyu $$0, gck $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gz()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public akn a(T $$0) {
      return a;
   }
}
