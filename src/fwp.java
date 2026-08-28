public class fwp extends fwt {
   private static final xv b = xv.c("multiplayerWarning.header").a(n.r);
   private static final xv c = xv.c("multiplayerWarning.message");
   private static final xv d = xv.c("multiplayerWarning.check");
   private static final xv s = b.f().f("\n").b(c);
   private final fty u;

   public fwp(fty $$0) {
      super(b, c, d, s);
      this.u = $$0;
   }

   @Override
   protected frv l() {
      fry $$0 = fry.e().a(8);
      $$0.a(fof.a(xu.i, $$0x -> {
         if (this.a.a()) {
            this.m.n.u = true;
            this.m.n.az();
         }

         this.m.a(new fwo(this.u));
      }).a());
      $$0.a(fof.a(xu.k, $$0x -> this.aP_()).a());
      return $$0;
   }

   @Override
   public void aP_() {
      this.m.a(this.u);
   }
}
