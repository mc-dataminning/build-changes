public class zi implements ve<wx> {
   private final int a;
   private final byte b;

   public zi(biw $$0, byte $$1) {
      this.a = $$0.ah();
      this.b = $$1;
   }

   public zi(so $$0) {
      this.a = $$0.n();
      this.b = $$0.readByte();
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.a);
      $$0.k(this.b);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public biw a(cqb $$0) {
      return $$0.a(this.a);
   }

   public byte a() {
      return this.b;
   }
}
