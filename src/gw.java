public class gw implements gv {
   private final aif a;
   private final gu b;

   public gw(aif $$0, gu $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public aif g() {
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
   public gu d() {
      return this.b;
   }

   @Override
   public dcb e() {
      return this.a.a_(this.b);
   }

   @Override
   public <T extends czn> T f() {
      return (T)this.a.c_(this.b);
   }
}
