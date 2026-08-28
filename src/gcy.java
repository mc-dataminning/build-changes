public class gcy extends gdc {
   private static final xc b = xc.c("multiplayerWarning.header").a(o.r);
   private static final xc c = xc.c("multiplayerWarning.message");
   private static final xc d = xc.c("multiplayerWarning.check");
   private static final xc s = b.f().f("\n").b(c);
   private final gaf u;

   public gcy(gaf $$0) {
      super(b, c, d, s);
      this.u = $$0;
   }

   @Override
   protected fyc m() {
      fyf $$0 = fyf.e().a(8);
      $$0.a(fun.a(xb.i, $$0x -> {
         if (this.a.a()) {
            this.m.n.u = true;
            this.m.n.az();
         }

         this.m.a(new gcx(this.u));
      }).a());
      $$0.a(fun.a(xb.k, $$0x -> this.aP_()).a());
      return $$0;
   }

   @Override
   public void aP_() {
      this.m.a(this.u);
   }
}
