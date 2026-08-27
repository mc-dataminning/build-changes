public class fxg<T extends bii & bjo, M extends fet<T>> extends fxf<T, M> {
   private final aer a;
   private final M b;

   public fxg(fus<T, M> $$0, M $$1, aer $$2) {
      super($$0);
      this.b = $$1;
      this.a = $$2;
   }

   @Override
   public void a(elf $$0, fnu $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.i()) {
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$6);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         elj $$10 = $$1.getBuffer(foc.e(this.a));
         this.b.a($$0, $$10, $$2, fyl.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
