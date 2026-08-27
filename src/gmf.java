public abstract class gmf<T extends bru, M extends fsw<T>> {
   private final gjp<T, M> a;

   public gmf(gjp<T, M> $$0) {
      this.a = $$0;
   }

   protected static <T extends bso> void a(
      fsw<T> $$0,
      fsw<T> $$1,
      akm $$2,
      eys $$3,
      gck $$4,
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
      if (!$$6.ch()) {
         $$0.a($$1);
         $$1.a($$6, $$7, $$8, $$12);
         $$1.a($$6, $$7, $$8, $$9, $$10, $$11);
         a($$1, $$2, $$3, $$4, $$5, $$6, $$13, $$14, $$15);
      }
   }

   protected static <T extends bso> void a(fsw<T> $$0, akm $$1, eys $$2, gck $$3, int $$4, T $$5, float $$6, float $$7, float $$8) {
      eyw $$9 = $$3.getBuffer(gcs.e($$1));
      $$0.a($$2, $$9, $$4, giu.c($$5, 0.0F), $$6, $$7, $$8, 1.0F);
   }

   public M c() {
      return this.a.a();
   }

   protected akm a(T $$0) {
      return this.a.a($$0);
   }

   public abstract void a(eys var1, gck var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10);
}
