public class gvc extends gwd<gze, gcp> {
   private final gbx<gze> a;
   private final hdq b;

   public gvc(gtl<gze, gcp> $$0, gei $$1, hdq $$2) {
      super($$0);
      this.a = new gcn<>($$1.a(gel.cc));
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

   public void a(fgq $$0, glj $$1, int $$2, gze $$3, float $$4, float $$5) {
      if (!$$3.u && $$3.aw) {
         hck $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.Q, dfr.d.c)) {
               $$0.a();
               if (this.a($$3.Q, dfr.d.a)) {
                  $$0.a(0.0F, -0.053125F, 0.06875F);
               }

               fgu $$7 = $$1.getBuffer(glt.c($$6.c()));
               this.d().a(this.a);
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, hba.d);
               $$0.b();
            }
         }
      }
   }
}
