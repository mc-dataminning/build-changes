public class fym<T extends bjt & bkz, M extends ffx<T>> extends fyl<T, M> {
   private final afw a;
   private final M b;

   public fym(fvy<T, M> $$0, M $$1, afw $$2) {
      super($$0);
      this.b = $$1;
      this.a = $$2;
   }

   @Override
   public void a(emh $$0, fpb $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.i()) {
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$6);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         eml $$10 = $$1.getBuffer(fpj.e(this.a));
         this.b.a($$0, $$10, $$2, fzr.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
