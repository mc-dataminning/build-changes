public abstract class hav<S extends hcn, M extends gfy<? super S>> {
   private final gye<S, M> a;

   public hav(gye<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends hdn> void a(gfy<S> $$0, alg $$1, fjj $$2, gqa $$3, int $$4, S $$5, int $$6) {
      if (!$$5.z) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(gfy<?> $$0, alg $$1, fjj $$2, gqa $$3, int $$4, hdn $$5, int $$6) {
      fjn $$7 = $$3.getBuffer(gqk.g($$1));
      $$0.a($$2, $$7, $$4, gxi.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.c();
   }

   public abstract void a(fjj var1, gqa var2, int var3, S var4, float var5, float var6);
}
