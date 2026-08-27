public class xj implements ve<wx> {
   private final bgv a;
   private final boolean b;

   public xj(bgv $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public xj(sp $$0) {
      this.a = bgv.a($$0.readUnsignedByte());
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(sp $$0) {
      $$0.k(this.a.a());
      $$0.a(this.b);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.b;
   }

   public bgv d() {
      return this.a;
   }
}
