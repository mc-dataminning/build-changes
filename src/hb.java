public record hb(byte b) {
   public static final hb a = new hb((byte)0);
   private static final byte c = 1;
   private static final byte d = 2;

   private hb a(byte $$0) {
      int $$1 = this.b | $$0;
      return $$1 != this.b ? new hb((byte)$$1) : this;
   }

   public boolean a() {
      return (this.b & 1) != 0;
   }

   public hb b() {
      return this.a((byte)1);
   }

   public boolean c() {
      return (this.b & 2) != 0;
   }

   public hb d() {
      return this.a((byte)2);
   }

   public byte e() {
      return this.b;
   }
}
