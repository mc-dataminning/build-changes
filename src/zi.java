public class zi implements vd<ww> {
   private final int a;
   private final byte b;

   public zi(biq $$0, byte $$1) {
      this.a = $$0.ai();
      this.b = $$1;
   }

   public zi(so $$0) {
      this.a = $$0.m();
      this.b = $$0.readByte();
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.a);
      $$0.k(this.b);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public biq a(cpv $$0) {
      return $$0.a(this.a);
   }

   public byte a() {
      return this.b;
   }
}
