public class gad extends fxi {
   private static final int a = 600;
   private final vp b;
   private frq c;
   private int d;
   private final fvi s = fvi.d();

   public gad(ww $$0, vp $$1) {
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
      this.s.a(new fsx(this.l, this.p));
      this.c = this.s.a(frq.a(wv.p, $$0 -> this.b.a(fwh.a)).a());
      this.c.j = false;
      this.s.a();
      this.s.a($$1 -> {
         fro var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fvc.a(this.s, this.J());
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
