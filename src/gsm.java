public abstract class gsm<S extends guc, M extends fxz<? super S>> {
   private final gpv<S, M> a;

   public gsm(gpv<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends gva> void a(fxz<S> $$0, alh $$1, fdt $$2, ghw $$3, int $$4, S $$5, int $$6) {
      if (!$$5.u) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(fxz<?> $$0, alh $$1, fdt $$2, ghw $$3, int $$4, gva $$5, int $$6) {
      fdx $$7 = $$3.getBuffer(gig.f($$1));
      $$0.a($$2, $$7, $$4, gpa.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.e();
   }

   public abstract void a(fdt var1, ghw var2, int var3, S var4, float var5, float var6);
}
