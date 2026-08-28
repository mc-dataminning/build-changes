public class fwo extends fws {
   private static final xv b = xv.c("multiplayerWarning.header").a(n.r);
   private static final xv c = xv.c("multiplayerWarning.message");
   private static final xv d = xv.c("multiplayerWarning.check");
   private static final xv s = b.f().f("\n").b(c);
   private final ftx u;

   public fwo(ftx $$0) {
      super(b, c, d, s);
      this.u = $$0;
   }

   @Override
   protected fru l() {
      frx $$0 = frx.e().a(8);
      $$0.a(foe.a(xu.i, $$0x -> {
         if (this.a.a()) {
            this.m.n.u = true;
            this.m.n.az();
         }

         this.m.a(new fwn(this.u));
      }).a());
      $$0.a(foe.a(xu.k, $$0x -> this.aP_()).a());
      return $$0;
   }

   @Override
   public void aP_() {
      this.m.a(this.u);
   }
}
