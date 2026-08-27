public class gde<T extends cgk> extends gdu<T> {
   private static final ajh a = new ajh("textures/entity/illager/evoker.png");

   public gde(gdb.a $$0) {
      super($$0, new fot<>($$0.a(fre.ab)), 0.5F);
      this.a(new ghf<T, fot<T>>(this, $$0.d()) {
         public void a(eub $$0, fxs $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gx()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public ajh a(T $$0) {
      return a;
   }
}
