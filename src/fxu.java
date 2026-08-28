public class fxu extends fyb {
   private static final wy a = wy.c("outOfMemory.title");
   private static final wy b = wy.c("outOfMemory.message");
   private static final int c = 300;
   private final fvx d = new fvx(this);

   public fxu() {
      super(a);
   }

   @Override
   protected void aO_() {
      this.d.a(a, this.p);
      this.d.c(new fsu(300, b, this.p));
      fwb $$0 = this.d.b(fwb.e().a(8));
      $$0.a(fsj.a(wx.l, $$0x -> this.m.a(new fyd())).a());
      $$0.a(fsj.a(wy.c("menu.quit"), $$0x -> this.m.q()).a());
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
