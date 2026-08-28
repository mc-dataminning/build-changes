public class giy<T extends ckl> extends gjo<T> {
   private static final ale a = new ale("textures/entity/illager/evoker.png");

   public giy(giv.a $$0) {
      super($$0, new fum<>($$0.a(fwx.ab)), 0.5F);
      this.a(new gna<T, fum<T>>(this, $$0.d()) {
         public void a(ezw $$0, gdm $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
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
