public class ghw<T extends cjm> extends gim<T> {
   private static final akm a = new akm("textures/entity/illager/evoker.png");

   public ghw(ght.a $$0) {
      super($$0, new ftk<>($$0.a(fvv.ab)), 0.5F);
      this.a(new gly<T, ftk<T>>(this, $$0.d()) {
         public void a(eys $$0, gck $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gz()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public akm a(T $$0) {
      return a;
   }
}
