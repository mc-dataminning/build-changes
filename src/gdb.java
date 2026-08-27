public class gdb<T extends cgi> extends gdr<T> {
   private static final ajh a = new ajh("textures/entity/illager/evoker.png");

   public gdb(gcy.a $$0) {
      super($$0, new foq<>($$0.a(frc.X)), 0.5F);
      this.a(new ghc<T, foq<T>>(this, $$0.d()) {
         public void a(etz $$0, fxq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
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
