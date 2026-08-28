public class gab extends gaf {
   private static final ww b = ww.c("multiplayerWarning.header").a(n.r);
   private static final ww c = ww.c("multiplayerWarning.message");
   private static final ww d = ww.c("multiplayerWarning.check");
   private static final ww s = b.f().f("\n").b(c);
   private final fxi u;

   public gab(fxi $$0) {
      super(b, c, d, s);
      this.u = $$0;
   }

   @Override
   protected fvf m() {
      fvi $$0 = fvi.e().a(8);
      $$0.a(frq.a(wv.i, $$0x -> {
         if (this.a.a()) {
            this.m.n.u = true;
            this.m.n.az();
         }

         this.m.a(new gaa(this.u));
      }).a());
      $$0.a(frq.a(wv.k, $$0x -> this.aK_()).a());
      return $$0;
   }

   @Override
   public void aK_() {
      this.m.a(this.u);
   }
}
