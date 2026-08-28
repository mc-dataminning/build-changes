public abstract class hcy<S extends her, M extends gic<? super S>> {
   private final hah<S, M> a;

   public hcy(hah<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends hfr> void a(gic<S> $$0, alk $$1, flq $$2, gsc $$3, int $$4, S $$5, int $$6) {
      if (!$$5.z) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(gic<?> $$0, alk $$1, flq $$2, gsc $$3, int $$4, hfr $$5, int $$6) {
      flt $$7 = $$3.getBuffer(gsn.g($$1));
      $$0.a($$2, $$7, $$4, gzl.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.c();
   }

   public abstract void a(flq var1, gsc var2, int var3, S var4, float var5, float var6);
}
