public class zh implements ux<wp> {
   private final double a;
   private final double b;
   private final long c;

   public zh(dgr $$0) {
      this.a = $$0.i();
      this.b = $$0.k();
      this.c = $$0.j();
   }

   public zh(si $$0) {
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.n();
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(wp $$0) {
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
