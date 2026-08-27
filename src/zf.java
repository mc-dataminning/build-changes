public class zf implements uo<zb> {
   private final bdu a;

   public zf(bdu $$0) {
      this.a = $$0;
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public zf(sf $$0) {
      this.a = bdu.a($$0.readUnsignedByte());
   }

   @Override
   public void a(sf $$0) {
      $$0.writeByte(this.a.a());
   }

   public bdu a() {
      return this.a;
   }
}
