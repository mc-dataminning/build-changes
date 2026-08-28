public class gvd extends gwe<gzf, gcq> {
   private final gby<gzf> a;
   private final hdr b;

   public gvd(gtm<gzf, gcq> $$0, gej $$1, hdr $$2) {
      super($$0);
      this.a = new gco<>($$1.a(gem.cc));
      this.b = $$2;
   }

   private boolean a(cxo $$0, dfr.d $$1) {
      dft $$2 = $$0.a(ku.D);
      if ($$2 != null && !$$2.c().isEmpty()) {
         dfr $$3 = this.b.a($$2.c().get());
         return !$$3.a($$1).isEmpty();
      } else {
         return false;
      }
   }

   public void a(fgr $$0, glk $$1, int $$2, gzf $$3, float $$4, float $$5) {
      if (!$$3.u && $$3.aw) {
         hcl $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.Q, dfr.d.c)) {
               $$0.a();
               if (this.a($$3.Q, dfr.d.a)) {
                  $$0.a(0.0F, -0.053125F, 0.06875F);
               }

               fgv $$7 = $$1.getBuffer(glu.d($$6.c()));
               this.d().a(this.a);
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, hbb.d);
               $$0.b();
            }
         }
      }
   }
}
