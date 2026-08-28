public class fyy extends fzc {
   private static final wv b = wv.c("multiplayerWarning.header").a(n.r);
   private static final wv c = wv.c("multiplayerWarning.message");
   private static final wv d = wv.c("multiplayerWarning.check");
   private static final wv s = b.f().f("\n").b(c);
   private final fwf u;

   public fyy(fwf $$0) {
      super(b, c, d, s);
      this.u = $$0;
   }

   @Override
   protected fuc m() {
      fuf $$0 = fuf.e().a(8);
      $$0.a(fqn.a(wu.i, $$0x -> {
         if (this.a.a()) {
            this.m.n.u = true;
            this.m.n.az();
         }

         this.m.a(new fyx(this.u));
      }).a());
      $$0.a(fqn.a(wu.k, $$0x -> this.aK_()).a());
      return $$0;
   }

   @Override
   public void aK_() {
      this.m.a(this.u);
   }
}
