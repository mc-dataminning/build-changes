public class gan extends gar {
   private static final wy b = wy.c("multiplayerWarning.header").a(n.r);
   private static final wy c = wy.c("multiplayerWarning.message");
   private static final wy d = wy.c("multiplayerWarning.check");
   private static final wy s = b.f().f("\n").b(c);
   private final fxu u;

   public gan(fxu $$0) {
      super(b, c, d, s);
      this.u = $$0;
   }

   @Override
   protected fvr m() {
      fvu $$0 = fvu.e().a(8);
      $$0.a(fsc.a(wx.i, $$0x -> {
         if (this.a.a()) {
            this.m.n.u = true;
            this.m.n.az();
         }

         this.m.a(new gam(this.u));
      }).a());
      $$0.a(fsc.a(wx.k, $$0x -> this.aK_()).a());
      return $$0;
   }

   @Override
   public void aK_() {
      this.m.a(this.u);
   }
}
