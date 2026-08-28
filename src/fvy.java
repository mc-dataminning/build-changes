public class fvy extends fwf {
   private static final wv a = wv.c("outOfMemory.title");
   private static final wv b = wv.c("outOfMemory.message");
   private static final int c = 300;
   private final fub d = new fub(this);

   public fvy() {
      super(a);
   }

   @Override
   protected void aN_() {
      this.d.a(a, this.p);
      this.d.c(new fqy(300, b, this.p));
      fuf $$0 = this.d.b(fuf.e().a(8));
      $$0.a(fqn.a(wu.l, $$0x -> this.m.a(new fwh())).a());
      $$0.a(fqn.a(wv.c("menu.quit"), $$0x -> this.m.q()).a());
      this.d.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public boolean aC_() {
      return false;
   }
}
