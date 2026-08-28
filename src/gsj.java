public class gsj extends gsm<gvn, fze> {
   private final fyx a;
   private final gvj b = new gvj();

   public gsj(gpv<gvn, fze> $$0, gax $$1) {
      super($$0);
      this.a = new fyx($$1.a(gba.br));
      this.b.c = fyx.a.e;
   }

   public void a(fdt $$0, ghw $$1, int $$2, gvn $$3, float $$4, float $$5) {
      chc.b $$6 = $$3.aE;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      chc.b $$7 = $$3.aF;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(fdt $$0, ghw $$1, int $$2, gvn $$3, chc.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.I ? -1.3F : -1.5F, 0.0F);
      this.b.p = $$3.p;
      this.b.X = $$3.X;
      this.b.Y = $$3.Y;
      this.b.U = $$5;
      this.b.V = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(gpm.a($$4))), $$2, gxj.d);
      $$0.b();
   }
}
