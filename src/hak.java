public class hak extends han<hdr, ggw> {
   private final ggp a;
   private final hdn b = new hdn();

   public hak(gxw<hdr, ggw> $$0, giq $$1) {
      super($$0);
      this.a = new ggp($$1.a(git.bZ));
      this.b.c = ggp.a.e;
   }

   public void a(fjc $$0, gps $$1, int $$2, hdr $$3, float $$4, float $$5) {
      cjk.b $$6 = $$3.aE;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      cjk.b $$7 = $$3.aF;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(fjc $$0, gps $$1, int $$2, hdr $$3, cjk.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.N ? -1.3F : -1.5F, 0.0F);
      this.b.u = $$3.u;
      this.b.ad = $$3.ad;
      this.b.ae = $$3.ae;
      this.b.aa = $$5;
      this.b.ab = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(gxm.a($$4))), $$2, hif.d);
      $$0.b();
   }
}
