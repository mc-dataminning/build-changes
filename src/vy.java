public class vy implements uo<ur> {
   private final int a;
   private final int b;
   private final int c;

   public vy(int $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public vy(sf $$0) {
      this.a = $$0.readUnsignedByte();
      this.b = $$0.m();
      this.c = $$0.readInt();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeByte(this.a);
      $$0.d(this.b);
      $$0.writeInt(this.c);
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

   public int d() {
      return this.c;
   }
}
