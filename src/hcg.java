public class hcg extends hcj<hfq, git> {
   private final gim a;
   private final hfm b = new hfm();

   public hcg(gzs<hfq, git> $$0, gkn $$1) {
      super($$0);
      this.a = new gim($$1.a(gkq.cb));
      this.b.c = gim.a.e;
   }

   public void a(fld $$0, grn $$1, int $$2, hfq $$3, float $$4, float $$5) {
      ckp.b $$6 = $$3.aH;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      ckp.b $$7 = $$3.aI;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(fld $$0, grn $$1, int $$2, hfq $$3, ckp.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.Q ? -1.3F : -1.5F, 0.0F);
      this.b.v = $$3.v;
      this.b.ag = $$3.ag;
      this.b.ah = $$3.ah;
      this.b.ad = $$5;
      this.b.ae = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(gzi.a($$4))), $$2, hkg.d);
      $$0.b();
   }
}
