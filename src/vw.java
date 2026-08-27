public class vw implements uo<ur> {
   private final int a;
   private final int b;

   public vw(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public vw(sf $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeInt(this.a);
      $$0.writeInt(this.b);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int c() {
      return this.b;
   }
}
