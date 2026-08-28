public class fxn extends fxu {
   private static final wy a = wy.c("outOfMemory.title");
   private static final wy b = wy.c("outOfMemory.message");
   private static final int c = 300;
   private final fvq d = new fvq(this);

   public fxn() {
      super(a);
   }

   @Override
   protected void aN_() {
      this.d.a(a, this.p);
      this.d.c(new fsn(300, b, this.p));
      fvu $$0 = this.d.b(fvu.e().a(8));
      $$0.a(fsc.a(wx.l, $$0x -> this.m.a(new fxw())).a());
      $$0.a(fsc.a(wy.c("menu.quit"), $$0x -> this.m.q()).a());
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
