public class gbl extends gbp {
   private static final wy b = wy.c("multiplayerWarning.header").a(o.r);
   private static final wy c = wy.c("multiplayerWarning.message");
   private static final wy d = wy.c("multiplayerWarning.check");
   private static final wy s = b.f().f("\n").b(c);
   private final fys u;

   public gbl(fys $$0) {
      super(b, c, d, s);
      this.u = $$0;
   }

   @Override
   protected fwp m() {
      fws $$0 = fws.e().a(8);
      $$0.a(fta.a(wx.i, $$0x -> {
         if (this.a.a()) {
            this.m.n.u = true;
            this.m.n.az();
         }

         this.m.a(new gbk(this.u));
      }).a());
      $$0.a(fta.a(wx.k, $$0x -> this.aL_()).a());
      return $$0;
   }

   @Override
   public void aL_() {
      this.m.a(this.u);
   }
}
