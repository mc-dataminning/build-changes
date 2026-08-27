public class zn implements xg<zb> {
   private final bjz a;
   private final boolean b;

   public zn(bjz $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public zn(uj $$0) {
      this.a = bjz.a($$0.readUnsignedByte());
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(uj $$0) {
      $$0.k(this.a.a());
      $$0.a(this.b);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.b;
   }

   public bjz d() {
      return this.a;
   }
}
