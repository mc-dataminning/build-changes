public class fzh extends gaf {
   private static final int a = 8;
   private static final int b = 210;
   private static final xc c = xc.c("credits_and_attribution.screen.title");
   private static final xc d = xc.c("credits_and_attribution.button.credits");
   private static final xc s = xc.c("credits_and_attribution.button.attribution");
   private static final xc u = xc.c("credits_and_attribution.button.licenses");
   private final gaf v;
   private final fyb w = new fyb(this);

   public fzh(gaf $$0) {
      super(c);
      this.v = $$0;
   }

   @Override
   protected void aS_() {
      this.w.a(c, this.p);
      fyf $$0 = this.w.c(fyf.d()).a(8);
      $$0.c().b();
      $$0.a(fun.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(fun.a(s, fzc.b(this, ayl.d)).a(210).a());
      $$0.a(fun.a(u, fzc.b(this, ayl.e)).a(210).a());
      this.w.b(fun.a(xb.d, $$0x -> this.aP_()).a(200).a());
      this.w.a();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   private void m() {
      this.m.a(new gai(false, () -> this.m.a(this)));
   }

   @Override
   public void aP_() {
      this.m.a(this.v);
   }
}
