public class gne<T extends cmv> extends gnh<T, fvd<T>> {
   private final fuy a;

   public gne(gkr<T, fvd<T>> $$0, fwu $$1) {
      super($$0);
      this.a = new fuy($$1.a(fwx.aG));
   }

   public void a(ezw $$0, gdm $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(ezw $$0, gdm $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      ur $$9 = $$8 ? $$3.gt() : $$3.gu();
      bsy.a($$9.l("id")).filter($$0x -> $$0x == bsy.ax).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.ca() ? -1.3F : -1.5F, 0.0F);
         cft.b $$11 = cft.b.a($$9.h("Variant"));
         faa $$12 = $$1.getBuffer(this.a.a(gki.a($$11)));
         this.a.a($$0, $$12, $$2, goo.d, $$4, $$5, $$6, $$7, $$3.ai);
         $$0.b();
      });
   }
}
