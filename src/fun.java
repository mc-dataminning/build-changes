public class fun extends fur {
   private static final xj b = xj.c("multiplayerWarning.header").a(n.r);
   private static final xj c = xj.c("multiplayerWarning.message");
   private static final xj d = xj.c("multiplayerWarning.check");
   private static final xj s = b.f().f("\n").b(c);
   private final frw u;

   public fun(frw $$0) {
      super(b, c, d, s);
      this.u = $$0;
   }

   @Override
   protected fpt m() {
      fpw $$0 = fpw.e().a(8);
      $$0.a(fmd.a(xi.i, $$0x -> {
         if (this.a.a()) {
            this.m.n.u = true;
            this.m.n.ay();
         }

         this.m.a(new fum(this.u));
      }).a());
      $$0.a(fmd.a(xi.k, $$0x -> this.aO_()).a());
      return $$0;
   }

   @Override
   public void aO_() {
      this.m.a(this.u);
   }
}
