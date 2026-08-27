public class fyq<T extends ccz> extends fzg<T> {
   private static final ahg a = new ahg("textures/entity/illager/evoker.png");

   public fyq(fyn.a $$0) {
      super($$0, new fkl<>($$0.a(fmw.Y)), 0.5F);
      this.a(new gcr<T, fkl<T>>(this, $$0.d()) {
         public void a(eqb $$0, fth $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.go()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public ahg a(T $$0) {
      return a;
   }
}
