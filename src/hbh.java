public abstract class hbh<S extends hcz, M extends ggk<? super S>> {
   private final gyq<S, M> a;

   public hbh(gyq<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends hdz> void a(ggk<S> $$0, alg $$1, fjy $$2, gqm $$3, int $$4, S $$5, int $$6) {
      if (!$$5.z) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(ggk<?> $$0, alg $$1, fjy $$2, gqm $$3, int $$4, hdz $$5, int $$6) {
      fkc $$7 = $$3.getBuffer(gqx.g($$1));
      $$0.a($$2, $$7, $$4, gxu.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.c();
   }

   public abstract void a(fjy var1, gqm var2, int var3, S var4, float var5, float var6);
}
