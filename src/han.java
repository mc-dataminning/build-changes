public abstract class han<S extends hcf, M extends gfq<? super S>> {
   private final gxw<S, M> a;

   public han(gxw<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends hdf> void a(gfq<S> $$0, alg $$1, fjc $$2, gps $$3, int $$4, S $$5, int $$6) {
      if (!$$5.z) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(gfq<?> $$0, alg $$1, fjc $$2, gps $$3, int $$4, hdf $$5, int $$6) {
      fjg $$7 = $$3.getBuffer(gqc.g($$1));
      $$0.a($$2, $$7, $$4, gxa.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.c();
   }

   public abstract void a(fjc var1, gps var2, int var3, S var4, float var5, float var6);
}
