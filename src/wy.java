public class wy implements vd<ww> {
   private final int a;
   private final double b;
   private final double c;
   private final double d;
   private final int e;

   public wy(biw $$0) {
      this.a = $$0.ah();
      this.b = $$0.dq();
      this.c = $$0.ds();
      this.d = $$0.dw();
      this.e = $$0.q();
   }

   public wy(so $$0) {
      this.a = $$0.m();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readShort();
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.l(this.e);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public double d() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   public double f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }
}
