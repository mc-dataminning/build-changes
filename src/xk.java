public class xk implements vf<wy> {
   private final bgx a;
   private final boolean b;

   public xk(bgx $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public xk(sq $$0) {
      this.a = bgx.a($$0.readUnsignedByte());
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(sq $$0) {
      $$0.k(this.a.a());
      $$0.a(this.b);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.b;
   }

   public bgx d() {
      return this.a;
   }
}
