public abstract class gtn<S extends gvd, M extends fza<? super S>> {
   private final gqw<S, M> a;

   public gtn(gqw<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends gwb> void a(fza<S> $$0, all $$1, fek $$2, gix $$3, int $$4, S $$5, int $$6) {
      if (!$$5.u) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(fza<?> $$0, all $$1, fek $$2, gix $$3, int $$4, gwb $$5, int $$6) {
      feo $$7 = $$3.getBuffer(gjh.f($$1));
      $$0.a($$2, $$7, $$4, gqb.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.e();
   }

   public abstract void a(fek var1, gix var2, int var3, S var4, float var5, float var6);
}
