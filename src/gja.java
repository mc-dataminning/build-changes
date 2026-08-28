public class gja<T extends ckn> extends gjq<T> {
   private static final alf a = new alf("textures/entity/illager/evoker.png");

   public gja(gix.a $$0) {
      super($$0, new fuo<>($$0.a(fwz.ab)), 0.5F);
      this.a(new gnc<T, fuo<T>>(this, $$0.d()) {
         public void a(ezy $$0, gdo $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
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
