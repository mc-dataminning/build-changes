public class gjp<T extends cka> extends gkf<T> {
   private static final akk a = new akk("textures/entity/illager/evoker.png");

   public gjp(gjm.a $$0) {
      super($$0, new fvc<>($$0.a(fxn.ab)), 0.5F);
      this.a(new gnr<T, fvc<T>>(this, $$0.d()) {
         public void a(fam $$0, ged $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gy()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public akk a(T $$0) {
      return a;
   }
}
