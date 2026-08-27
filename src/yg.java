public class yg implements wb<xu> {
   private final bhy a;
   private final boolean b;

   public yg(bhy $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public yg(tl $$0) {
      this.a = bhy.a($$0.readUnsignedByte());
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(tl $$0) {
      $$0.k(this.a.a());
      $$0.a(this.b);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.b;
   }

   public bhy d() {
      return this.a;
   }
}
