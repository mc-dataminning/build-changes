public abstract class grf<S extends gsu, M extends fxa<? super S>> {
   private final goo<S, M> a;

   public grf(goo<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends gts> void a(fxa<S> $$0, alb $$1, fcu $$2, ggv $$3, int $$4, S $$5, int $$6) {
      if (!$$5.u) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(fxa<?> $$0, alb $$1, fcu $$2, ggv $$3, int $$4, gts $$5, int $$6) {
      fcy $$7 = $$3.getBuffer(ghe.f($$1));
      $$0.a($$2, $$7, $$4, gnt.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.e();
   }

   protected alb b(S $$0) {
      return this.a.a($$0);
   }

   public abstract void a(fcu var1, ggv var2, int var3, S var4, float var5, float var6);
}
