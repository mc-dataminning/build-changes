public class ve implements uo<ur> {
   private final bdu a;
   private final boolean b;

   public ve(bdu $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ve(sf $$0) {
      this.a = bdu.a($$0.readUnsignedByte());
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeByte(this.a.a());
      $$0.writeBoolean(this.b);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.b;
   }

   public bdu c() {
      return this.a;
   }
}
