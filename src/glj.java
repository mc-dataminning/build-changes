public class glj<T extends brh & bsp, M extends fsb<T>> extends gli<T, M> {
   private final akh a;
   private final M b;

   public glj(gis<T, M> $$0, M $$1, akh $$2) {
      super($$0);
      this.b = $$1;
      this.a = $$2;
   }

   @Override
   public void a(exx $$0, gbo $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.i()) {
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$6);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         eyb $$10 = $$1.getBuffer(gbw.e(this.a));
         this.b.a($$0, $$10, $$2, gmp.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
