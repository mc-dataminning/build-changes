public class grt extends grw<guw, fyp> {
   private final fyi a;

   public grt(gpf<guw, fyp> $$0, gah $$1) {
      super($$0);
      this.a = new fyi($$1.a(gak.br));
   }

   public void a(fde $$0, ghg $$1, int $$2, guw $$3, float $$4, float $$5) {
      cgq.b $$6 = $$3.aE;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      cgq.b $$7 = $$3.aF;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(fde $$0, ghg $$1, int $$2, guw $$3, cgq.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.I ? -1.3F : -1.5F, 0.0F);
      fdi $$8 = $$1.getBuffer(this.a.a(gow.a($$4)));
      this.a.a($$0, $$8, $$2, gws.d, $$3.X, $$3.Y, $$5, $$6, $$3.p);
      $$0.b();
   }
}
