public class fwi extends fwm {
   private static final xk b = xk.c("multiplayerWarning.header").a(n.r);
   private static final xk c = xk.c("multiplayerWarning.message");
   private static final xk d = xk.c("multiplayerWarning.check");
   private static final xk s = b.f().f("\n").b(c);
   private final ftr u;

   public fwi(ftr $$0) {
      super(b, c, d, s);
      this.u = $$0;
   }

   @Override
   protected fro l() {
      frr $$0 = frr.e().a(8);
      $$0.a(fny.a(xj.i, $$0x -> {
         if (this.a.a()) {
            this.m.n.u = true;
            this.m.n.az();
         }

         this.m.a(new fwh(this.u));
      }).a());
      $$0.a(fny.a(xj.k, $$0x -> this.aP_()).a());
      return $$0;
   }

   @Override
   public void aP_() {
      this.m.a(this.u);
   }
}
