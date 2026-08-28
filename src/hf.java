public record hf(byte b) {
   public static final hf a = new hf((byte)0);
   private static final byte c = 1;
   private static final byte d = 2;

   private hf a(byte $$0) {
      int $$1 = this.b | $$0;
      return $$1 != this.b ? new hf((byte)$$1) : this;
   }

   public boolean a() {
      return (this.b & 1) != 0;
   }

   public hf b() {
      return this.a((byte)1);
   }

   public boolean c() {
      return (this.b & 2) != 0;
   }

   public hf d() {
      return this.a((byte)2);
   }

   public byte e() {
      return this.b;
   }
}
