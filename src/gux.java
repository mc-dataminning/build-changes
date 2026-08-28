public class gux extends gvy<gyz, gck> {
   private final gbs<gyz> a;
   private final hdl b;

   public gux(gtg<gyz, gck> $$0, ged $$1, hdl $$2) {
      super($$0);
      this.a = new gci<>($$1.a(geg.cc));
      this.b = $$2;
   }

   private boolean a(cxk $$0, dfk.d $$1) {
      dfm $$2 = $$0.a(ku.D);
      if ($$2 != null && !$$2.c().isEmpty()) {
         dfk $$3 = this.b.a($$2.c().get());
         return !$$3.a($$1).isEmpty();
      } else {
         return false;
      }
   }

   public void a(fgl $$0, gle $$1, int $$2, gyz $$3, float $$4, float $$5) {
      if (!$$3.u && $$3.aw) {
         hcf $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.Q, dfk.d.c)) {
               $$0.a();
               if (this.a($$3.Q, dfk.d.a)) {
                  $$0.a(0.0F, -0.053125F, 0.06875F);
               }

               fgp $$7 = $$1.getBuffer(glo.c($$6.c()));
               this.d().a(this.a);
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, hav.d);
               $$0.b();
            }
         }
      }
   }
}
