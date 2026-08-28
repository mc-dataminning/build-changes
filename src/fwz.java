public class fwz extends fxd {
   private static final wo b = wo.c("multiplayerWarning.header").a(n.r);
   private static final wo c = wo.c("multiplayerWarning.message");
   private static final wo d = wo.c("multiplayerWarning.check");
   private static final wo s = b.f().f("\n").b(c);
   private final fui u;

   public fwz(fui $$0) {
      super(b, c, d, s);
      this.u = $$0;
   }

   @Override
   protected fsf m() {
      fsi $$0 = fsi.e().a(8);
      $$0.a(fop.a(wn.i, $$0x -> {
         if (this.a.a()) {
            this.m.n.u = true;
            this.m.n.az();
         }

         this.m.a(new fwy(this.u));
      }).a());
      $$0.a(fop.a(wn.k, $$0x -> this.aO_()).a());
      return $$0;
   }

   @Override
   public void aO_() {
      this.m.a(this.u);
   }
}
