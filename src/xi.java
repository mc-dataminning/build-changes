public class xi implements vd<ww> {
   private final bgv a;
   private final boolean b;

   public xi(bgv $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public xi(so $$0) {
      this.a = bgv.a($$0.readUnsignedByte());
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(so $$0) {
      $$0.k(this.a.a());
      $$0.a(this.b);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.b;
   }

   public bgv d() {
      return this.a;
   }
}
