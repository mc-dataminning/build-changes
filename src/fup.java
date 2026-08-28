public class fup extends frw {
   private static final int a = 600;
   private final wd b;
   private fmd c;
   private int d;
   private final fpw s = fpw.d();

   public fup(xj $$0, wd $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aG_() {
      return false;
   }

   @Override
   protected void aR_() {
      this.s.c().b().a(10);
      this.s.a(new fnk(this.l, this.p));
      this.c = this.s.a(fmd.a(xi.p, $$0 -> this.b.a(fqv.a)).a());
      this.c.j = false;
      this.s.a();
      this.s.a($$1 -> {
         fmb var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fpq.a(this.s, this.H());
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
