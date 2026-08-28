public class guz extends gwa<gzb, gcm> {
   private final gbu<gzb> a;
   private final hdn b;

   public guz(gti<gzb, gcm> $$0, gef $$1, hdn $$2) {
      super($$0);
      this.a = new gck<>($$1.a(gei.cf));
      this.b = $$2;
   }

   private boolean a(cxg $$0, dfj.d $$1) {
      dfl $$2 = $$0.a(ku.D);
      if ($$2 != null && !$$2.c().isEmpty()) {
         dfj $$3 = this.b.a($$2.c().get());
         return !$$3.a($$1).isEmpty();
      } else {
         return false;
      }
   }

   public void a(fgl $$0, glg $$1, int $$2, gzb $$3, float $$4, float $$5) {
      if (!$$3.u && $$3.aw) {
         hch $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.Q, dfj.d.c)) {
               $$0.a();
               if (this.a($$3.Q, dfj.d.a)) {
                  $$0.a(0.0F, -0.053125F, 0.06875F);
               }

               fgp $$7 = $$1.getBuffer(glq.d($$6.c()));
               this.d().a(this.a);
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, hax.d);
               $$0.b();
            }
         }
      }
   }
}
