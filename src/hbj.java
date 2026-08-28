public class hbj extends hbm<her, ghv> {
   private final gho a;
   private final hen b = new hen();

   public hbj(gyv<her, ghv> $$0, gjp $$1) {
      super($$0);
      this.a = new gho($$1.a(gjs.cb));
      this.b.c = gho.a.e;
   }

   public void a(fkd $$0, gqr $$1, int $$2, her $$3, float $$4, float $$5) {
      cjt.b $$6 = $$3.aE;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      cjt.b $$7 = $$3.aF;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(fkd $$0, gqr $$1, int $$2, her $$3, cjt.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.N ? -1.3F : -1.5F, 0.0F);
      this.b.u = $$3.u;
      this.b.ad = $$3.ad;
      this.b.ae = $$3.ae;
      this.b.aa = $$5;
      this.b.ab = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(gyl.a($$4))), $$2, hjg.d);
      $$0.b();
   }
}
