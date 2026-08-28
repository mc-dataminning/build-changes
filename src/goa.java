public abstract class goa<T extends bsh, M extends fuq<T>> {
   private final glk<T, M> a;

   public goa(glk<T, M> $$0) {
      this.a = $$0;
   }

   protected static <T extends btc> void a(
      fuq<T> $$0,
      fuq<T> $$1,
      akk $$2,
      fao $$3,
      gef $$4,
      int $$5,
      T $$6,
      float $$7,
      float $$8,
      float $$9,
      float $$10,
      float $$11,
      float $$12,
      float $$13,
      float $$14,
      float $$15
   ) {
      if (!$$6.cj()) {
         $$0.a($$1);
         $$1.a($$6, $$7, $$8, $$12);
         $$1.a($$6, $$7, $$8, $$9, $$10, $$11);
         a($$1, $$2, $$3, $$4, $$5, $$6, $$13, $$14, $$15);
      }
   }

   protected static <T extends btc> void a(fuq<T> $$0, akk $$1, fao $$2, gef $$3, int $$4, T $$5, float $$6, float $$7, float $$8) {
      fas $$9 = $$3.getBuffer(gen.e($$1));
      $$0.a($$2, $$9, $$4, gkp.c($$5, 0.0F), $$6, $$7, $$8, 1.0F);
   }

   public M c() {
      return this.a.a();
   }

   protected akk a(T $$0) {
      return this.a.a($$0);
   }

   public abstract void a(fao var1, gef var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10);
}
