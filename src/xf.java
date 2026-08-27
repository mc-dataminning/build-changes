public class xf implements va<ws> {
   private final bgq a;
   private final boolean b;

   public xf(bgq $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public xf(sl $$0) {
      this.a = bgq.a($$0.readUnsignedByte());
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(sl $$0) {
      $$0.k(this.a.a());
      $$0.a(this.b);
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.b;
   }

   public bgq d() {
      return this.a;
   }
}
