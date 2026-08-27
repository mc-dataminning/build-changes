public class gy implements gx {
   private final akr a;
   private final gw b;

   public gy(akr $$0, gw $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public akr g() {
      return this.a;
   }

   @Override
   public double a() {
      return (double)this.b.u() + 0.5;
   }

   @Override
   public double b() {
      return (double)this.b.v() + 0.5;
   }

   @Override
   public double c() {
      return (double)this.b.w() + 0.5;
   }

   @Override
   public gw d() {
      return this.b;
   }

   @Override
   public dfj e() {
      return this.a.a_(this.b);
   }

   @Override
   public <T extends dcv> T f() {
      return (T)this.a.c_(this.b);
   }
}
