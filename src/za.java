public class za implements wu<yo> {
   private final bji a;
   private final boolean b;

   public za(bji $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public za(ue $$0) {
      this.a = bji.a($$0.readUnsignedByte());
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(ue $$0) {
      $$0.k(this.a.a());
      $$0.a(this.b);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.b;
   }

   public bji d() {
      return this.a;
   }
}
