public abstract class gcq<T extends blp, M extends fjp<T>> {
   private final gaa<T, M> a;

   public gcq(gaa<T, M> $$0) {
      this.a = $$0;
   }

   protected static <T extends bmf> void a(
      fjp<T> $$0,
      fjp<T> $$1,
      ahd $$2,
      ept $$3,
      fsz $$4,
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
      if (!$$6.ce()) {
         $$0.a($$1);
         $$1.a($$6, $$7, $$8, $$12);
         $$1.a($$6, $$7, $$8, $$9, $$10, $$11);
         a($$1, $$2, $$3, $$4, $$5, $$6, $$13, $$14, $$15);
      }
   }

   protected static <T extends bmf> void a(fjp<T> $$0, ahd $$1, ept $$2, fsz $$3, int $$4, T $$5, float $$6, float $$7, float $$8) {
      epx $$9 = $$3.getBuffer(fth.e($$1));
      $$0.a($$2, $$9, $$4, fzg.c($$5, 0.0F), $$6, $$7, $$8, 1.0F);
   }

   public M c() {
      return this.a.a();
   }

   protected ahd a(T $$0) {
      return this.a.a($$0);
   }

   public abstract void a(ept var1, fsz var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10);
}
