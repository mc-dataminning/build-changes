public class fuh extends frp {
   private static final int a = 600;
   private final wf b;
   private flw c;
   private int d;
   private final fpp s = fpp.d();

   public fuh(xl $$0, wf $$1) {
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
      this.s.a(new fnd(this.l, this.p));
      this.c = this.s.a(flw.a(xk.p, $$0 -> this.b.a(fqo.a)).a());
      this.c.j = false;
      this.s.a();
      this.s.a($$1 -> {
         flu var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fpj.a(this.s, this.H());
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
