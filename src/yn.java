public class yn implements ux<wp> {
   private final int a;
   private final aer b;

   public yn(int $$0, cmb<?> $$1) {
      this.a = $$0;
      this.b = $$1.e();
   }

   public yn(si $$0) {
      this.a = $$0.readByte();
      this.b = $$0.s();
   }

   @Override
   public void a(si $$0) {
      $$0.k(this.a);
      $$0.a(this.b);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public aer a() {
      return this.b;
   }

   public int d() {
      return this.a;
   }
}
