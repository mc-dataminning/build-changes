public class yt implements vd<ww> {
   private final int a;
   private final aew b;

   public yt(int $$0, cmk<?> $$1) {
      this.a = $$0;
      this.b = $$1.a();
   }

   public yt(so $$0) {
      this.a = $$0.readByte();
      this.b = $$0.s();
   }

   @Override
   public void a(so $$0) {
      $$0.k(this.a);
      $$0.a(this.b);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public aew a() {
      return this.b;
   }

   public int d() {
      return this.a;
   }
}
