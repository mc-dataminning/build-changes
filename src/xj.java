public class xj implements ve<wx> {
   private final bhb a;
   private final boolean b;

   public xj(bhb $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public xj(so $$0) {
      this.a = bhb.a($$0.readUnsignedByte());
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(so $$0) {
      $$0.k(this.a.a());
      $$0.a(this.b);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.b;
   }

   public bhb d() {
      return this.a;
   }
}
