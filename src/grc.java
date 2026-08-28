public class grc extends grf<guf, fyf> {
   private final fxy a;

   public grc(goo<guf, fyf> $$0, fzx $$1) {
      super($$0);
      this.a = new fxy($$1.a(gaa.bq));
   }

   public void a(fcu $$0, ggv $$1, int $$2, guf $$3, float $$4, float $$5) {
      cgl.b $$6 = $$3.aF;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      cgl.b $$7 = $$3.aG;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(fcu $$0, ggv $$1, int $$2, guf $$3, cgl.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.I ? -1.3F : -1.5F, 0.0F);
      fcy $$8 = $$1.getBuffer(this.a.a(gof.a($$4)));
      this.a.a($$0, $$8, $$2, gwb.d, $$3.X, $$3.Y, $$5, $$6, $$3.p);
      $$0.b();
   }
}
