public class fzj extends fzq {
   private static final xg a = xg.c("outOfMemory.title");
   private static final xg b = xg.c("outOfMemory.message");
   private static final int c = 300;
   private final fxm d = new fxm(this);

   public fzj() {
      super(a);
   }

   @Override
   protected void aT_() {
      this.d.a(a, this.p);
      this.d.c(new fuj(300, b, this.p));
      fxq $$0 = this.d.b(fxq.e().a(8));
      $$0.a(fty.a(xf.l, $$0x -> this.m.a(new fzs())).a());
      $$0.a(fty.a(xg.c("menu.quit"), $$0x -> this.m.q()).a());
      this.d.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public boolean aI_() {
      return false;
   }
}
