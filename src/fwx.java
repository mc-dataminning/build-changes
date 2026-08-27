public class fwx<T extends bii & bjp, M extends feo<T>> extends fww<T, M> {
   private final aer a;
   private final M b;

   public fwx(fuj<T, M> $$0, M $$1, aer $$2) {
      super($$0);
      this.b = $$1;
      this.a = $$2;
   }

   @Override
   public void a(elg $$0, fnl $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.i()) {
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$6);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         elk $$10 = $$1.getBuffer(fnt.e(this.a));
         this.b.a($$0, $$10, $$2, fyc.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
