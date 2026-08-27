public class ut implements uo<ur> {
   private final int a;
   private final double b;
   private final double c;
   private final double d;
   private final int e;

   public ut(bfp $$0) {
      this.a = $$0.af();
      this.b = $$0.dn();
      this.c = $$0.dp();
      this.d = $$0.dt();
      this.e = $$0.j();
   }

   public ut(sf $$0) {
      this.a = $$0.m();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readShort();
   }

   @Override
   public void a(sf $$0) {
      $$0.d(this.a);
      $$0.writeDouble(this.b);
      $$0.writeDouble(this.c);
      $$0.writeDouble(this.d);
      $$0.writeShort(this.e);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public double c() {
      return this.b;
   }

   public double d() {
      return this.c;
   }

   public double e() {
      return this.d;
   }

   public int f() {
      return this.e;
   }
}
