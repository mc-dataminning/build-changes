public abstract class hcj<S extends hec, M extends ghn<? super S>> {
   private final gzs<S, M> a;

   public hcj(gzs<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends hfe> void a(ghn<S> $$0, alr $$1, fld $$2, grn $$3, int $$4, S $$5, int $$6) {
      if (!$$5.A) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(ghn<?> $$0, alr $$1, fld $$2, grn $$3, int $$4, hfe $$5, int $$6) {
      flg $$7 = $$3.getBuffer(gry.g($$1));
      $$0.a($$2, $$7, $$4, gyw.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.c();
   }

   public abstract void a(fld var1, grn var2, int var3, S var4, float var5, float var6);
}
