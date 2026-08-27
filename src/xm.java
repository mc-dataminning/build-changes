public class xm implements uo<ur> {
   private final double a;
   private final double b;
   private final long c;

   public xm(dds $$0) {
      this.a = $$0.i();
      this.b = $$0.k();
      this.c = $$0.j();
   }

   public xm(sf $$0) {
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.n();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeDouble(this.a);
      $$0.writeDouble(this.b);
      $$0.b(this.c);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public double a() {
      return this.a;
   }

   public double c() {
      return this.b;
   }

   public long d() {
      return this.c;
   }
}
