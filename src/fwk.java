public class fwk extends ftr {
   private static final int a = 600;
   private final wp b;
   private fny c;
   private int d;
   private final frr s = frr.d();

   public fwk(xv $$0, wp $$1) {
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
      this.s.a(new fpg(this.l, this.p));
      this.c = this.s.a(fny.a(xu.p, $$0 -> this.b.a(fsq.a)).a());
      this.c.j = false;
      this.s.a();
      this.s.a($$1 -> {
         fnw var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      frl.a(this.s, this.H());
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
