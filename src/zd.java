public record zd(aaw d, byte e) implements va<ws> {
   public static final byte a = 1;
   public static final byte b = 2;
   public static final byte c = 3;

   public zd(sl $$0) {
      this(new aaw($$0), $$0.readByte());
   }

   @Override
   public void a(sl $$0) {
      this.d.a($$0);
      $$0.k(this.e);
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.e & $$0) != 0;
   }

   public aaw a() {
      return this.d;
   }

   public byte d() {
      return this.e;
   }
}
