public class fza extends fwf {
   private static final int a = 600;
   private final vo b;
   private fqn c;
   private int d;
   private final fuf s = fuf.d();

   public fza(wv $$0, vo $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aC_() {
      return false;
   }

   @Override
   protected void aN_() {
      this.s.c().b().a(10);
      this.s.a(new fru(this.l, this.p));
      this.c = this.s.a(fqn.a(wu.p, $$0 -> this.b.a(fve.a)).a());
      this.c.j = false;
      this.s.a();
      this.s.a($$1 -> {
         fql var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      ftz.a(this.s, this.J());
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
