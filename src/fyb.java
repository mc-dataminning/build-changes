public class fyb extends fvi {
   private static final int a = 600;
   private final vi b;
   private fpq c;
   private int d;
   private final fti s = fti.d();

   public fyb(wp $$0, vi $$1) {
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
      this.s.a(new fqx(this.l, this.p));
      this.c = this.s.a(fpq.a(wo.p, $$0 -> this.b.a(fuh.a)).a());
      this.c.j = false;
      this.s.a();
      this.s.a($$1 -> {
         fpo var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      ftc.a(this.s, this.J());
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
