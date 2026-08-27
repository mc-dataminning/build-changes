public class fwa<T extends cbs> extends fwq<T> {
   private static final agi a = new agi("textures/entity/illager/evoker.png");

   public fwa(fvx.a $$0) {
      super($$0, new fid<>($$0.a(fkn.V)), 0.5F);
      this.a(new fzy<T, fid<T>>(this, $$0.d()) {
         public void a(enw $$0, fqu $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gp()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public agi a(T $$0) {
      return a;
   }
}
