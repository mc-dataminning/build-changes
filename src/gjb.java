public class gjb<T extends cko> extends gjr<T> {
   private static final alf a = new alf("textures/entity/illager/evoker.png");

   public gjb(giy.a $$0) {
      super($$0, new fup<>($$0.a(fxa.ab)), 0.5F);
      this.a(new gnd<T, fup<T>>(this, $$0.d()) {
         public void a(ezz $$0, gdp $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gA()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
   }

   public alf a(T $$0) {
      return a;
   }
}
