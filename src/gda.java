public class gda extends gaf {
   private static final int a = 600;
   private final vv b;
   private fun c;
   private int d;
   private final fyf s = fyf.d();

   public gda(xc $$0, vv $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aH_() {
      return false;
   }

   @Override
   protected void aS_() {
      this.s.c().b().a(10);
      this.s.a(new fvu(this.l, this.p));
      this.c = this.s.a(fun.a(xb.p, $$0 -> this.b.a(fze.a)).a());
      this.c.j = false;
      this.s.a();
      this.s.a($$1 -> {
         ful var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fxz.a(this.s, this.J());
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
