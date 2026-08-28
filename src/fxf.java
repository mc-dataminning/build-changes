public class fxf extends fum {
   private static final int a = 600;
   private final vi b;
   private fou c;
   private int d;
   private final fsm s = fsm.d();

   public fxf(wp $$0, vi $$1) {
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
      this.s.a(new fqb(this.l, this.p));
      this.c = this.s.a(fou.a(wo.p, $$0 -> this.b.a(ftl.a)).a());
      this.c.j = false;
      this.s.a();
      this.s.a($$1 -> {
         fos var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fsg.a(this.s, this.J());
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
