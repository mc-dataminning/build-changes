public class yv implements vf<wy> {
   private final int a;
   private final aey b;

   public yv(int $$0, cmm<?> $$1) {
      this.a = $$0;
      this.b = $$1.a();
   }

   public yv(sq $$0) {
      this.a = $$0.readByte();
      this.b = $$0.s();
   }

   @Override
   public void a(sq $$0) {
      $$0.k(this.a);
      $$0.a(this.b);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public aey a() {
      return this.b;
   }

   public int d() {
      return this.a;
   }
}
