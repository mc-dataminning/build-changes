public record hp(byte b) {
   public static final hp a = new hp((byte)0);
   private static final byte c = 1;
   private static final byte d = 2;

   private hp a(byte $$0) {
      int $$1 = this.b | $$0;
      return $$1 != this.b ? new hp((byte)$$1) : this;
   }

   public boolean a() {
      return (this.b & 1) != 0;
   }

   public hp b() {
      return this.a((byte)1);
   }

   public boolean c() {
      return (this.b & 2) != 0;
   }

   public hp d() {
      return this.a((byte)2);
   }

   public byte e() {
      return this.b;
   }
}
