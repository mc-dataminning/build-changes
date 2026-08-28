public class gjc<T extends ckp> extends gjs<T> {
   private static final alf a = new alf("textures/entity/illager/evoker.png");

   public gjc(giz.a $$0) {
      super($$0, new fuq<>($$0.a(fxb.ab)), 0.5F);
      this.a(new gne<T, fuq<T>>(this, $$0.d()) {
         public void a(faa $$0, gdq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
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
