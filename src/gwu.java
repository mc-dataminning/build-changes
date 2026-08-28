public abstract class gwu<S extends gyl, M extends gcc<? super S>> {
   private final guc<S, M> a;

   public gwu(guc<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends gzl> void a(gcc<S> $$0, akv $$1, ffv $$2, glz $$3, int $$4, S $$5, int $$6) {
      if (!$$5.z) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(gcc<?> $$0, akv $$1, ffv $$2, glz $$3, int $$4, gzl $$5, int $$6) {
      ffz $$7 = $$3.getBuffer(gmj.g($$1));
      $$0.a($$2, $$7, $$4, gtg.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.c();
   }

   public abstract void a(ffv var1, glz var2, int var3, S var4, float var5, float var6);
}
