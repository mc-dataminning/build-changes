public class gcw extends gda {
   private static final xa b = xa.c("multiplayerWarning.header").a(o.r);
   private static final xa c = xa.c("multiplayerWarning.message");
   private static final xa d = xa.c("multiplayerWarning.check");
   private static final xa s = b.f().f("\n").b(c);
   private final gad u;

   public gcw(gad $$0) {
      super(b, c, d, s);
      this.u = $$0;
   }

   @Override
   protected fya m() {
      fyd $$0 = fyd.e().a(8);
      $$0.a(ful.a(wz.i, $$0x -> {
         if (this.a.a()) {
            this.m.n.u = true;
            this.m.n.az();
         }

         this.m.a(new gcv(this.u));
      }).a());
      $$0.a(ful.a(wz.k, $$0x -> this.aP_()).a());
      return $$0;
   }

   @Override
   public void aP_() {
      this.m.a(this.u);
   }
}
