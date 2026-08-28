public class fwn extends fwr {
   private static final xv b = xv.c("multiplayerWarning.header").a(n.r);
   private static final xv c = xv.c("multiplayerWarning.message");
   private static final xv d = xv.c("multiplayerWarning.check");
   private static final xv s = b.f().f("\n").b(c);
   private final ftw u;

   public fwn(ftw $$0) {
      super(b, c, d, s);
      this.u = $$0;
   }

   @Override
   protected frt l() {
      frw $$0 = frw.e().a(8);
      $$0.a(fod.a(xu.i, $$0x -> {
         if (this.a.a()) {
            this.m.n.u = true;
            this.m.n.az();
         }

         this.m.a(new fwm(this.u));
      }).a());
      $$0.a(fod.a(xu.k, $$0x -> this.aP_()).a());
      return $$0;
   }

   @Override
   public void aP_() {
      this.m.a(this.u);
   }
}
