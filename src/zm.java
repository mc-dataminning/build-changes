public class zm implements xf<za> {
   private final bjx a;
   private final boolean b;

   public zm(bjx $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public zm(ui $$0) {
      this.a = bjx.a($$0.readUnsignedByte());
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(ui $$0) {
      $$0.k(this.a.a());
      $$0.a(this.b);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.b;
   }

   public bjx d() {
      return this.a;
   }
}
