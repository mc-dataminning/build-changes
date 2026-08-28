public abstract class gwt<S extends gyk, M extends gcb<? super S>> {
   private final gub<S, M> a;

   public gwt(gub<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends gzk> void a(gcb<S> $$0, akv $$1, ffu $$2, gly $$3, int $$4, S $$5, int $$6) {
      if (!$$5.z) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(gcb<?> $$0, akv $$1, ffu $$2, gly $$3, int $$4, gzk $$5, int $$6) {
      ffy $$7 = $$3.getBuffer(gmi.g($$1));
      $$0.a($$2, $$7, $$4, gtf.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.c();
   }

   public abstract void a(ffu var1, gly var2, int var3, S var4, float var5, float var6);
}
