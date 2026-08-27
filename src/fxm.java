public class fxm<T extends biw & bkc, M extends fey<T>> extends fxl<T, M> {
   private final aez a;
   private final M b;

   public fxm(fuy<T, M> $$0, M $$1, aez $$2) {
      super($$0);
      this.b = $$1;
      this.a = $$2;
   }

   @Override
   public void a(elj $$0, foa $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.i()) {
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$6);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         eln $$10 = $$1.getBuffer(foi.e(this.a));
         this.b.a($$0, $$10, $$2, fyr.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
