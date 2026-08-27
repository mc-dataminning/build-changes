public class gx implements gw {
   private final aki a;
   private final gv b;

   public gx(aki $$0, gv $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public aki g() {
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
   public gv d() {
      return this.b;
   }

   @Override
   public dey e() {
      return this.a.a_(this.b);
   }

   @Override
   public <T extends dck> T f() {
      return (T)this.a.c_(this.b);
   }
}
