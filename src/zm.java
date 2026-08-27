public class zm implements vd<ww> {
   private final double a;
   private final double b;

   public zm(dha $$0) {
      this.a = $$0.a();
      this.b = $$0.b();
   }

   public zm(so $$0) {
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public double a() {
      return this.b;
   }

   public double d() {
      return this.a;
   }
}
