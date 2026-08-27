public record za(aat d, byte e) implements ux<wp> {
   public static final byte a = 1;
   public static final byte b = 2;
   public static final byte c = 3;

   public za(si $$0) {
      this(new aat($$0), $$0.readByte());
   }

   @Override
   public void a(si $$0) {
      this.d.a($$0);
      $$0.k(this.e);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.e & $$0) != 0;
   }

   public aat a() {
      return this.d;
   }

   public byte d() {
      return this.e;
   }
}
