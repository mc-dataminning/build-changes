public record gx(byte b) {
   public static final gx a = new gx((byte)0);
   private static final byte c = 1;
   private static final byte d = 2;

   private gx a(byte $$0) {
      int $$1 = this.b | $$0;
      return $$1 != this.b ? new gx((byte)$$1) : this;
   }

   public boolean a() {
      return (this.b & 1) != 0;
   }

   public gx b() {
      return this.a((byte)1);
   }

   public boolean c() {
      return (this.b & 2) != 0;
   }

   public gx d() {
      return this.a((byte)2);
   }

   public byte e() {
      return this.b;
   }
}
