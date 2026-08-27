public record gw(byte b) {
   public static final gw a = new gw((byte)0);
   private static final byte c = 1;
   private static final byte d = 2;

   private gw a(byte $$0) {
      int $$1 = this.b | $$0;
      return $$1 != this.b ? new gw((byte)$$1) : this;
   }

   public boolean a() {
      return (this.b & 1) != 0;
   }

   public gw b() {
      return this.a((byte)1);
   }

   public boolean c() {
      return (this.b & 2) != 0;
   }

   public gw d() {
      return this.a((byte)2);
   }

   public byte e() {
      return this.b;
   }
}
