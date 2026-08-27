public class fwf<T extends cbx> extends fwv<T> {
   private static final agm a = new agm("textures/entity/illager/evoker.png");

   public fwf(fwc.a $$0) {
      super($$0, new fii<>($$0.a(fks.V)), 0.5F);
      this.a(new gad<T, fii<T>>(this, $$0.d()) {
         public void a(eob $$0, fqz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gp()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public agm a(T $$0) {
      return a;
   }
}
