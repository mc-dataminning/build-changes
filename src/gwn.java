public class gwn extends gwq<gzt, gdd> {
   private final gcw a;
   private final gzp b = new gzp();

   public gwn(gty<gzt, gdd> $$0, gew $$1) {
      super($$0);
      this.a = new gcw($$1.a(gez.bN));
      this.b.c = gcw.a.e;
   }

   public void a(ffs $$0, glv $$1, int $$2, gzt $$3, float $$4, float $$5) {
      chm.b $$6 = $$3.aE;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      chm.b $$7 = $$3.aF;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(ffs $$0, glv $$1, int $$2, gzt $$3, chm.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.N ? -1.3F : -1.5F, 0.0F);
      this.b.u = $$3.u;
      this.b.ad = $$3.ad;
      this.b.ae = $$3.ae;
      this.b.aa = $$5;
      this.b.ab = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(gto.a($$4))), $$2, hec.d);
      $$0.b();
   }
}
