public class ggg<T extends cia> extends ggj<T, foj<T>> {
   private final foe a;

   public ggg(gdt<T, foj<T>> $$0, fqb $$1) {
      super($$0);
      this.a = new foe($$1.a(fqe.aC));
   }

   public void a(etd $$0, fwq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(etd $$0, fwq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      sy $$9 = $$8 ? $$3.gm() : $$3.gn();
      bol.a($$9.l("id")).filter($$0x -> $$0x == bol.av).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bU() ? -1.3F : -1.5F, 0.0F);
         cbc.b $$11 = cbc.b.a($$9.h("Variant"));
         eth $$12 = $$1.getBuffer(this.a.a(gdk.a($$11)));
         this.a.a($$0, $$12, $$2, ghq.d, $$4, $$5, $$6, $$7, $$3.ag);
         $$0.b();
      });
   }
}
