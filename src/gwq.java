public class gwq extends gwt<gzw, gdg> {
   private final gcz a;
   private final gzs b = new gzs();

   public gwq(gub<gzw, gdg> $$0, gez $$1) {
      super($$0);
      this.a = new gcz($$1.a(gfc.bN));
      this.b.c = gcz.a.e;
   }

   public void a(ffu $$0, gly $$1, int $$2, gzw $$3, float $$4, float $$5) {
      cho.b $$6 = $$3.aE;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      cho.b $$7 = $$3.aF;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(ffu $$0, gly $$1, int $$2, gzw $$3, cho.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.N ? -1.3F : -1.5F, 0.0F);
      this.b.u = $$3.u;
      this.b.ad = $$3.ad;
      this.b.ae = $$3.ae;
      this.b.aa = $$5;
      this.b.ab = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(gtr.a($$4))), $$2, hei.d);
      $$0.b();
   }
}
