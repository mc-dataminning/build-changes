public class gsu extends gsx<gvy, fzp> {
   private final fzi a;
   private final gvu b = new gvu();

   public gsu(gqg<gvy, fzp> $$0, gbi $$1) {
      super($$0);
      this.a = new fzi($$1.a(gbl.br));
      this.b.c = fzi.a.e;
   }

   public void a(feb $$0, gih $$1, int $$2, gvy $$3, float $$4, float $$5) {
      chh.b $$6 = $$3.aE;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      chh.b $$7 = $$3.aF;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(feb $$0, gih $$1, int $$2, gvy $$3, chh.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.I ? -1.3F : -1.5F, 0.0F);
      this.b.p = $$3.p;
      this.b.X = $$3.X;
      this.b.Y = $$3.Y;
      this.b.U = $$5;
      this.b.V = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(gpx.a($$4))), $$2, gxu.d);
      $$0.b();
   }
}
