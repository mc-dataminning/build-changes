public class xl implements uo<ur> {
   private final double a;
   private final double b;

   public xl(dds $$0) {
      this.a = $$0.a();
      this.b = $$0.b();
   }

   public xl(sf $$0) {
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeDouble(this.a);
      $$0.writeDouble(this.b);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public double a() {
      return this.b;
   }

   public double c() {
      return this.a;
   }
}
