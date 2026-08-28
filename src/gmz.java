public class gmz extends gns<cew, fud<cew>> {
   private final gdt a;

   public gmz(glc<cew, fud<cew>> $$0, gdt $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fag $$0, gdx $$1, int $$2, cew $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fq() == bss.b;
      $$0.a();
      float $$11 = 1.0F;
      float $$12 = -1.0F;
      float $$13 = aye.e($$3.dH()) / 60.0F;
      if ($$3.dH() < 0.0F) {
         $$0.a(0.0F, 1.0F - $$13 * 0.5F, -1.0F + $$13 * 0.5F);
      } else {
         $$0.a(0.0F, 1.0F + $$13 * 0.8F, -1.0F + $$13 * 0.2F);
      }

      cua $$14 = $$10 ? $$3.eT() : $$3.eU();
      this.a.a($$3, $$14, ctx.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
