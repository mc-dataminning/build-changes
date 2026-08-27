public record zh(aba d, byte e) implements ve<wx> {
   public static final byte a = 1;
   public static final byte b = 2;
   public static final byte c = 3;

   public zh(sp $$0) {
      this(new aba($$0), $$0.readByte());
   }

   @Override
   public void a(sp $$0) {
      this.d.a($$0);
      $$0.k(this.e);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.e & $$0) != 0;
   }

   public aba a() {
      return this.d;
   }

   public byte d() {
      return this.e;
   }
}
