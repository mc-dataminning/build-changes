public class gjr<T extends ckb> extends gkh<T> {
   private static final akk a = new akk("textures/entity/illager/evoker.png");

   public gjr(gjo.a $$0) {
      super($$0, new fve<>($$0.a(fxp.ab)), 0.5F);
      this.a(new gnt<T, fve<T>>(this, $$0.d()) {
         public void a(fao $$0, gef $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gx()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public akk a(T $$0) {
      return a;
   }
}
