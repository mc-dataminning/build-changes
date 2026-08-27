public record zi(abb d, byte e) implements vf<wy> {
   public static final byte a = 1;
   public static final byte b = 2;
   public static final byte c = 3;

   public zi(sq $$0) {
      this(new abb($$0), $$0.readByte());
   }

   @Override
   public void a(sq $$0) {
      this.d.a($$0);
      $$0.k(this.e);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.e & $$0) != 0;
   }

   public abb a() {
      return this.d;
   }

   public byte d() {
      return this.e;
   }
}
