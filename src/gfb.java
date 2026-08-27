public class gfb<T extends chh> extends gfe<T, fng<T>> {
   private final fnb a;

   public gfb(gco<T, fng<T>> $$0, foy $$1) {
      super($$0);
      this.a = new fnb($$1.a(fpb.aC));
   }

   public void a(esa $$0, fvm $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(esa $$0, fvm $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      sw $$9 = $$8 ? $$3.gk() : $$3.gl();
      bnu.a($$9.l("id")).filter($$0x -> $$0x == bnu.av).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bX() ? -1.3F : -1.5F, 0.0F);
         caj.b $$11 = caj.b.a($$9.h("Variant"));
         ese $$12 = $$1.getBuffer(this.a.a(gcf.a($$11)));
         this.a.a($$0, $$12, $$2, ggl.d, $$4, $$5, $$6, $$7, $$3.ag);
         $$0.b();
      });
   }
}
