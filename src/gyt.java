public abstract class gyt<S extends hak, M extends gea<? super S>> {
   private final gwc<S, M> a;

   public gyt(gwc<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends hbk> void a(gea<S> $$0, ald $$1, fho $$2, gny $$3, int $$4, S $$5, int $$6) {
      if (!$$5.z) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(gea<?> $$0, ald $$1, fho $$2, gny $$3, int $$4, hbk $$5, int $$6) {
      fhs $$7 = $$3.getBuffer(goi.g($$1));
      $$0.a($$2, $$7, $$4, gvg.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.c();
   }

   public abstract void a(fho var1, gny var2, int var3, S var4, float var5, float var6);
}
