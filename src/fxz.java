public class fxz extends fyd {
   private static final wp b = wp.c("multiplayerWarning.header").a(n.r);
   private static final wp c = wp.c("multiplayerWarning.message");
   private static final wp d = wp.c("multiplayerWarning.check");
   private static final wp s = b.f().f("\n").b(c);
   private final fvi u;

   public fxz(fvi $$0) {
      super(b, c, d, s);
      this.u = $$0;
   }

   @Override
   protected ftf m() {
      fti $$0 = fti.e().a(8);
      $$0.a(fpq.a(wo.i, $$0x -> {
         if (this.a.a()) {
            this.m.n.u = true;
            this.m.n.az();
         }

         this.m.a(new fxy(this.u));
      }).a());
      $$0.a(fpq.a(wo.k, $$0x -> this.aO_()).a());
      return $$0;
   }

   @Override
   public void aO_() {
      this.m.a(this.u);
   }
}
