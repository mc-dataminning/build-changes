public class zn implements uo<zb> {
   private final int a;
   private final int b;

   public zn(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public zn(sf $$0) {
      this.a = $$0.readByte();
      this.b = $$0.readByte();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeByte(this.a);
      $$0.writeByte(this.b);
   }

   public int a() {
      return this.a;
   }

   public int c() {
      return this.b;
   }
}
