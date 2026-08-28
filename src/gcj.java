public class gcj extends gcn {
   private static final xg b = xg.c("multiplayerWarning.header").a(o.r);
   private static final xg c = xg.c("multiplayerWarning.message");
   private static final xg d = xg.c("multiplayerWarning.check");
   private static final xg s = b.f().f("\n").b(c);
   private final fzq u;

   public gcj(fzq $$0) {
      super(b, c, d, s);
      this.u = $$0;
   }

   @Override
   protected fxn m() {
      fxq $$0 = fxq.e().a(8);
      $$0.a(fty.a(xf.i, $$0x -> {
         if (this.a.a()) {
            this.m.n.u = true;
            this.m.n.az();
         }

         this.m.a(new gci(this.u));
      }).a());
      $$0.a(fty.a(xf.k, $$0x -> this.aL_()).a());
      return $$0;
   }

   @Override
   public void aL_() {
      this.m.a(this.u);
   }
}
