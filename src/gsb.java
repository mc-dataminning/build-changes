public abstract class gsb<S extends gtq, M extends fxo<? super S>> {
   private final gpk<S, M> a;

   public gsb(gpk<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends guo> void a(fxo<S> $$0, ale $$1, fdi $$2, ghl $$3, int $$4, S $$5, int $$6) {
      if (!$$5.u) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(fxo<?> $$0, ale $$1, fdi $$2, ghl $$3, int $$4, guo $$5, int $$6) {
      fdm $$7 = $$3.getBuffer(ghv.f($$1));
      $$0.a($$2, $$7, $$4, gop.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.e();
   }

   public abstract void a(fdi var1, ghl var2, int var3, S var4, float var5, float var6);
}
