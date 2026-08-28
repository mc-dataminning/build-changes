public class gjj<T extends cjx> extends gjz<T> {
   private static final akk a = new akk("textures/entity/illager/evoker.png");

   public gjj(gjg.a $$0) {
      super($$0, new fuw<>($$0.a(fxh.ab)), 0.5F);
      this.a(new gnl<T, fuw<T>>(this, $$0.d()) {
         public void a(fag $$0, gdx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
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
