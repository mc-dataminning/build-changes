public class zb implements ux<wp> {
   private final int a;
   private final byte b;

   public zb(bii $$0, byte $$1) {
      this.a = $$0.ah();
      this.b = $$1;
   }

   public zb(si $$0) {
      this.a = $$0.m();
      this.b = $$0.readByte();
   }

   @Override
   public void a(si $$0) {
      $$0.c(this.a);
      $$0.k(this.b);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public bii a(cpm $$0) {
      return $$0.a(this.a);
   }

   public byte a() {
      return this.b;
   }
}
