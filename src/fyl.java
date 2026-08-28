public class fyl extends fys {
   private static final wy a = wy.c("outOfMemory.title");
   private static final wy b = wy.c("outOfMemory.message");
   private static final int c = 300;
   private final fwo d = new fwo(this);

   public fyl() {
      super(a);
   }

   @Override
   protected void aO_() {
      this.d.a(a, this.p);
      this.d.c(new ftl(300, b, this.p));
      fws $$0 = this.d.b(fws.e().a(8));
      $$0.a(fta.a(wx.l, $$0x -> this.m.a(new fyu())).a());
      $$0.a(fta.a(wy.c("menu.quit"), $$0x -> this.m.q()).a());
      this.d.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public boolean aD_() {
      return false;
   }
}
