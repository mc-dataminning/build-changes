public class ghj<T extends ciu> extends ghm<T, fpk<T>> {
   private final fpf a;

   public ghj(gew<T, fpk<T>> $$0, frb $$1) {
      super($$0);
      this.a = new fpf($$1.a(fre.aG));
   }

   public void a(eub $$0, fxs $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(eub $$0, fxs $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      ta $$9 = $$8 ? $$3.gq() : $$3.gr();
      bpd.a($$9.l("id")).filter($$0x -> $$0x == bpd.ax).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bX() ? -1.3F : -1.5F, 0.0F);
         cbu.b $$11 = cbu.b.a($$9.h("Variant"));
         euf $$12 = $$1.getBuffer(this.a.a(gen.a($$11)));
         this.a.a($$0, $$12, $$2, git.d, $$4, $$5, $$6, $$7, $$3.ah);
         $$0.b();
      });
   }
}
