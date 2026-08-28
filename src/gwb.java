public class gwb extends gwe<gzf, gcq> {
   private final gcj a;
   private final gzb b = new gzb();

   public gwb(gtm<gzf, gcq> $$0, gej $$1) {
      super($$0);
      this.a = new gcj($$1.a(gem.bK));
      this.b.c = gcj.a.e;
   }

   public void a(fgr $$0, glk $$1, int $$2, gzf $$3, float $$4, float $$5) {
      cim.b $$6 = $$3.aE;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      cim.b $$7 = $$3.aF;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(fgr $$0, glk $$1, int $$2, gzf $$3, cim.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.I ? -1.3F : -1.5F, 0.0F);
      this.b.p = $$3.p;
      this.b.X = $$3.X;
      this.b.Y = $$3.Y;
      this.b.U = $$5;
      this.b.V = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(gtc.a($$4))), $$2, hbb.d);
      $$0.b();
   }
}
