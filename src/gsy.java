public class gsy extends gty<gwz, gao> {
   private final fzw<gwz> a;
   private final hbl b;

   public gsy(grh<gwz, gao> $$0, gch $$1, hbl $$2) {
      super($$0);
      this.a = new gam<>($$1.a(gck.bZ));
      this.b = $$2;
   }

   private boolean a(cwm $$0, ddw.d $$1) {
      ddy $$2 = $$0.a(ku.D);
      if ($$2 != null && !$$2.c().isEmpty()) {
         ddw $$3 = this.b.a($$2.c().get());
         return !$$3.a($$1).isEmpty();
      } else {
         return false;
      }
   }

   public void a(fer $$0, gjg $$1, int $$2, gwz $$3, float $$4, float $$5) {
      if (!$$3.u && $$3.aw) {
         haf $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.Q, ddw.d.c)) {
               $$0.a();
               if (this.a($$3.Q, ddw.d.a)) {
                  $$0.a(0.0F, -0.053125F, 0.06875F);
               }

               fev $$7 = $$1.getBuffer(gjq.c($$6.c()));
               this.d().a(this.a);
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, gyv.d);
               $$0.b();
            }
         }
      }
   }
}
