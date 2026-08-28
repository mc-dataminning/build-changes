public class fxb extends fxi {
   private static final ww a = ww.c("outOfMemory.title");
   private static final ww b = ww.c("outOfMemory.message");
   private static final int c = 300;
   private final fve d = new fve(this);

   public fxb() {
      super(a);
   }

   @Override
   protected void aN_() {
      this.d.a(a, this.p);
      this.d.c(new fsb(300, b, this.p));
      fvi $$0 = this.d.b(fvi.e().a(8));
      $$0.a(frq.a(wv.l, $$0x -> this.m.a(new fxk())).a());
      $$0.a(frq.a(ww.c("menu.quit"), $$0x -> this.m.q()).a());
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
