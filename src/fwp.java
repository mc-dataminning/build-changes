public class fwp extends ftw {
   private static final int a = 600;
   private final wp b;
   private fod c;
   private int d;
   private final frw s = frw.d();

   public fwp(xv $$0, wp $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aH_() {
      return false;
   }

   @Override
   protected void aT_() {
      this.s.c().b().a(10);
      this.s.a(new fpl(this.l, this.p));
      this.c = this.s.a(fod.a(xu.p, $$0 -> this.b.a(fsv.a)).a());
      this.c.j = false;
      this.s.a();
      this.s.a($$1 -> {
         fob var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      frq.a(this.s, this.H());
   }

   @Override
   public void e() {
      super.e();
      this.d++;
      if (this.d == 600) {
         this.c.j = true;
      }

      if (this.b.i()) {
         this.b.b();
      } else {
         this.b.n();
      }
   }
}
