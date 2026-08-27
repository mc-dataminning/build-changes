public class fvn<T extends cbk> extends fwd<T> {
   private static final agg a = new agg("textures/entity/illager/evoker.png");

   public fvn(fvk.a $$0) {
      super($$0, new fhq<>($$0.a(fka.V)), 0.5F);
      this.a(new fzl<T, fhq<T>>(this, $$0.d()) {
         public void a(enk $$0, fqh $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.go()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public agg a(T $$0) {
      return a;
   }
}
