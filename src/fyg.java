public class fyg extends fyn {
   private static final wy a = wy.c("outOfMemory.title");
   private static final wy b = wy.c("outOfMemory.message");
   private static final int c = 300;
   private final fwj d = new fwj(this);

   public fyg() {
      super(a);
   }

   @Override
   protected void aO_() {
      this.d.a(a, this.p);
      this.d.c(new ftg(300, b, this.p));
      fwn $$0 = this.d.b(fwn.e().a(8));
      $$0.a(fsv.a(wx.l, $$0x -> this.m.a(new fyp())).a());
      $$0.a(fsv.a(wy.c("menu.quit"), $$0x -> this.m.q()).a());
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
