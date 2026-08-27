public class fyp<T extends ccy> extends fzf<T> {
   private static final ahg a = new ahg("textures/entity/illager/evoker.png");

   public fyp(fym.a $$0) {
      super($$0, new fkk<>($$0.a(fmv.Y)), 0.5F);
      this.a(new gcq<T, fkk<T>>(this, $$0.d()) {
         public void a(eqa $$0, ftg $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
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
