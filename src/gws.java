public abstract class gws<S extends gyj, M extends gca<? super S>> {
   private final gua<S, M> a;

   public gws(gua<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends gzj> void a(gca<S> $$0, akv $$1, fft $$2, glx $$3, int $$4, S $$5, int $$6) {
      if (!$$5.z) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(gca<?> $$0, akv $$1, fft $$2, glx $$3, int $$4, gzj $$5, int $$6) {
      ffx $$7 = $$3.getBuffer(gmh.g($$1));
      $$0.a($$2, $$7, $$4, gte.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.c();
   }

   public abstract void a(fft var1, glx var2, int var3, S var4, float var5, float var6);
}
