public record yz(aas d, byte e) implements uw<wo> {
   public static final byte a = 1;
   public static final byte b = 2;
   public static final byte c = 3;

   public yz(sh $$0) {
      this(new aas($$0), $$0.readByte());
   }

   @Override
   public void a(sh $$0) {
      this.d.a($$0);
      $$0.k(this.e);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.e & $$0) != 0;
   }

   public aas a() {
      return this.d;
   }

   public byte d() {
      return this.e;
   }
}
