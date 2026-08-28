public class giz<T extends ckm> extends gjp<T> {
   private static final ale a = new ale("textures/entity/illager/evoker.png");

   public giz(giw.a $$0) {
      super($$0, new fun<>($$0.a(fwy.ab)), 0.5F);
      this.a(new gnb<T, fun<T>>(this, $$0.d()) {
         public void a(ezx $$0, gdn $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gA()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public ale a(T $$0) {
      return a;
   }
}
