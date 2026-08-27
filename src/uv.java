public class uv implements uo<ur> {
   public static final int a = 0;
   public static final int b = 2;
   public static final int c = 3;
   public static final int d = 4;
   public static final int e = 5;
   private final int f;
   private final int g;

   public uv(bfj $$0, int $$1) {
      this.f = $$0.af();
      this.g = $$1;
   }

   public uv(sf $$0) {
      this.f = $$0.m();
      this.g = $$0.readUnsignedByte();
   }

   @Override
   public void a(sf $$0) {
      $$0.d(this.f);
      $$0.writeByte(this.g);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.f;
   }

   public int c() {
      return this.g;
   }
}
