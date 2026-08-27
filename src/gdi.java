public class gdi<T extends cfq> extends gdl<T, flo<T>> {
   private final flj a;

   public gdi(gav<T, flo<T>> $$0, fnf $$1) {
      super($$0);
      this.a = new flj($$1.a(fni.aC));
   }

   public void a(eqk $$0, ftt $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(eqk $$0, ftt $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      so $$9 = $$8 ? $$3.gj() : $$3.gk();
      bmc.a($$9.l("id")).filter($$0x -> $$0x == bmc.av).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bX() ? -1.3F : -1.5F, 0.0F);
         bys.b $$11 = bys.b.a($$9.h("Variant"));
         eqo $$12 = $$1.getBuffer(this.a.a(gam.a($$11)));
         this.a.a($$0, $$12, $$2, ges.d, $$4, $$5, $$6, $$7, $$3.ah);
         $$0.b();
      });
   }
}
