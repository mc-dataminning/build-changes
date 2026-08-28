public class hcv extends hcy<hgd, gji> {
   private final gjb a;
   private final hfz b = new hfz();

   public hcv(hah<hgd, gji> $$0, glc $$1) {
      super($$0);
      this.a = new gjb($$1.a(glf.cb));
      this.b.c = gjb.a.e;
   }

   public void a(flq $$0, gsc $$1, int $$2, hgd $$3, float $$4, float $$5) {
      ckg.b $$6 = $$3.aE;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      ckg.b $$7 = $$3.aF;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(flq $$0, gsc $$1, int $$2, hgd $$3, ckg.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.N ? -1.3F : -1.5F, 0.0F);
      this.b.u = $$3.u;
      this.b.ad = $$3.ad;
      this.b.ae = $$3.ae;
      this.b.aa = $$5;
      this.b.ab = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(gzx.a($$4))), $$2, hks.d);
      $$0.b();
   }
}
