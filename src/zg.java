public class zg implements uw<wo> {
   private final double a;
   private final double b;
   private final long c;

   public zg(dgp $$0) {
      this.a = $$0.i();
      this.b = $$0.k();
      this.c = $$0.j();
   }

   public zg(sh $$0) {
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.n();
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public double a() {
      return this.a;
   }

   public double d() {
      return this.b;
   }

   public long e() {
      return this.c;
   }
}
