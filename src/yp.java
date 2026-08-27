public class yp implements wk<yd> {
   private final bin a;
   private final boolean b;

   public yp(bin $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public yp(tu $$0) {
      this.a = bin.a($$0.readUnsignedByte());
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(tu $$0) {
      $$0.k(this.a.a());
      $$0.a(this.b);
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.b;
   }

   public bin d() {
      return this.a;
   }
}
