public class fzw extends gad {
   private static final xa a = xa.c("outOfMemory.title");
   private static final xa b = xa.c("outOfMemory.message");
   private static final int c = 300;
   private final fxz d = new fxz(this);

   public fzw() {
      super(a);
   }

   @Override
   protected void aS_() {
      this.d.a(a, this.p);
      this.d.c(new fuw(300, b, this.p));
      fyd $$0 = this.d.b(fyd.e().a(8));
      $$0.a(ful.a(wz.l, $$0x -> this.m.a(new gaf())).a());
      $$0.a(ful.a(xa.c("menu.quit"), $$0x -> this.m.q()).a());
      this.d.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public boolean aH_() {
      return false;
   }
}
