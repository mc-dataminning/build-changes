public record hj(byte b) {
   public static final hj a = new hj((byte)0);
   private static final byte c = 1;
   private static final byte d = 2;

   private hj a(byte $$0) {
      int $$1 = this.b | $$0;
      return $$1 != this.b ? new hj((byte)$$1) : this;
   }

   public boolean a() {
      return (this.b & 1) != 0;
   }

   public hj b() {
      return this.a((byte)1);
   }

   public boolean c() {
      return (this.b & 2) != 0;
   }

   public hj d() {
      return this.a((byte)2);
   }

   public byte e() {
      return this.b;
   }
}
