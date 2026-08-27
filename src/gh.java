public record gh(byte b) {
   public static final gh a = new gh((byte)0);
   private static final byte c = 1;
   private static final byte d = 2;

   private gh a(byte $$0) {
      int $$1 = this.b | $$0;
      return $$1 != this.b ? new gh((byte)$$1) : this;
   }

   public boolean a() {
      return (this.b & 1) != 0;
   }

   public gh b() {
      return this.a((byte)1);
   }

   public boolean c() {
      return (this.b & 2) != 0;
   }

   public gh d() {
      return this.a((byte)2);
   }

   public byte e() {
      return this.b;
   }
}
