public class gau extends gay {
   private static final wy b = wy.c("multiplayerWarning.header").a(n.r);
   private static final wy c = wy.c("multiplayerWarning.message");
   private static final wy d = wy.c("multiplayerWarning.check");
   private static final wy s = b.f().f("\n").b(c);
   private final fyb u;

   public gau(fyb $$0) {
      super(b, c, d, s);
      this.u = $$0;
   }

   @Override
   protected fvy m() {
      fwb $$0 = fwb.e().a(8);
      $$0.a(fsj.a(wx.i, $$0x -> {
         if (this.a.a()) {
            this.m.n.u = true;
            this.m.n.az();
         }

         this.m.a(new gat(this.u));
      }).a());
      $$0.a(fsj.a(wx.k, $$0x -> this.aL_()).a());
      return $$0;
   }

   @Override
   public void aL_() {
      this.m.a(this.u);
   }
}
