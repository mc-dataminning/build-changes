public class yt implements wo<yh> {
   private final biy a;
   private final boolean b;

   public yt(biy $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public yt(ty $$0) {
      this.a = biy.a($$0.readUnsignedByte());
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(ty $$0) {
      $$0.k(this.a.a());
      $$0.a(this.b);
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.b;
   }

   public biy d() {
      return this.a;
   }
}
