public class grm extends gsm<gvn, fze> {
   private final fym<gvn> a;
   private final gzz b;

   public grm(gpv<gvn, fze> $$0, gax $$1, gzz $$2) {
      super($$0);
      this.a = new fzc<>($$1.a(gba.bK));
      this.b = $$2;
   }

   private boolean a(cvx $$0) {
      ddh $$1 = $$0.a(kt.D);
      if ($$1 != null && !$$1.c().isEmpty()) {
         ddf $$2 = this.b.a($$1.c().get());
         return !$$2.a(ddf.d.c).isEmpty();
      } else {
         return false;
      }
   }

   public void a(fdt $$0, ghw $$1, int $$2, gvn $$3, float $$4, float $$5) {
      if (!$$3.u && $$3.aw) {
         gyt $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.Q)) {
               fdx $$7 = $$1.getBuffer(gig.c($$6.c()));
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, gxj.d);
            }
         }
      }
   }
}
