public class yj implements wo<yh> {
   private final int a;
   private final double b;
   private final double c;
   private final double d;
   private final int e;

   public yj(blb $$0) {
      this.a = $$0.aj();
      this.b = $$0.ds();
      this.c = $$0.du();
      this.d = $$0.dy();
      this.e = $$0.q();
   }

   public yj(ty $$0) {
      this.a = $$0.n();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readShort();
   }

   @Override
   public void a(ty $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.l(this.e);
   }

   public void a(yh $$0) {
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
