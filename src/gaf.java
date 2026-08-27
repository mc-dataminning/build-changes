public abstract class gaf<T extends bkq, M extends fhp<T>> {
   private final fxs<T, M> a;

   public gaf(fxs<T, M> $$0) {
      this.a = $$0;
   }

   protected static <T extends blg> void a(
      fhp<T> $$0,
      fhp<T> $$1,
      agi $$2,
      enw $$3,
      fqu $$4,
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

   protected static <T extends blg> void a(fhp<T> $$0, agi $$1, enw $$2, fqu $$3, int $$4, T $$5, float $$6, float $$7, float $$8) {
      eoa $$9 = $$3.getBuffer(frc.e($$1));
      $$0.a($$2, $$9, $$4, fwy.c($$5, 0.0F), $$6, $$7, $$8, 1.0F);
   }

   public M c() {
      return this.a.a();
   }

   protected agi a(T $$0) {
      return this.a.a($$0);
   }

   public abstract void a(enw var1, fqu var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10);
}
