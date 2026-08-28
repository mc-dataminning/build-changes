public class fxb extends fxf {
   private static final wo b = wo.c("multiplayerWarning.header").a(n.r);
   private static final wo c = wo.c("multiplayerWarning.message");
   private static final wo d = wo.c("multiplayerWarning.check");
   private static final wo s = b.f().f("\n").b(c);
   private final fuk u;

   public fxb(fuk $$0) {
      super(b, c, d, s);
      this.u = $$0;
   }

   @Override
   protected fsh m() {
      fsk $$0 = fsk.e().a(8);
      $$0.a(fos.a(wn.i, $$0x -> {
         if (this.a.a()) {
            this.m.n.u = true;
            this.m.n.az();
         }

         this.m.a(new fxa(this.u));
      }).a());
      $$0.a(fos.a(wn.k, $$0x -> this.aO_()).a());
      return $$0;
   }

   @Override
   public void aO_() {
      this.m.a(this.u);
   }
}
