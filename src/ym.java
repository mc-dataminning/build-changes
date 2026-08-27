public class ym implements uw<wo> {
   private final int a;
   private final aep b;

   public ym(int $$0, clz<?> $$1) {
      this.a = $$0;
      this.b = $$1.e();
   }

   public ym(sh $$0) {
      this.a = $$0.readByte();
      this.b = $$0.s();
   }

   @Override
   public void a(sh $$0) {
      $$0.k(this.a);
      $$0.a(this.b);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public aep a() {
      return this.b;
   }

   public int d() {
      return this.a;
   }
}
