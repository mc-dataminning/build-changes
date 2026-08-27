public class wa implements uo<ur> {
   private final double a;
   private final double b;
   private final double c;
   private final double d;
   private final long e;
   private final int f;
   private final int g;
   private final int h;

   public wa(sf $$0) {
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.n();
      this.f = $$0.m();
      this.g = $$0.m();
      this.h = $$0.m();
   }

   public wa(dds $$0) {
      this.a = $$0.a();
      this.b = $$0.b();
      this.c = $$0.i();
      this.d = $$0.k();
      this.e = $$0.j();
      this.f = $$0.m();
      this.g = $$0.r();
      this.h = $$0.q();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeDouble(this.a);
      $$0.writeDouble(this.b);
      $$0.writeDouble(this.c);
      $$0.writeDouble(this.d);
      $$0.b(this.e);
      $$0.d(this.f);
      $$0.d(this.g);
      $$0.d(this.h);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public double a() {
      return this.a;
   }

   public double c() {
      return this.b;
   }

   public double d() {
      return this.d;
   }

   public double e() {
      return this.c;
   }

   public long f() {
      return this.e;
   }

   public int g() {
      return this.f;
   }

   public int h() {
      return this.h;
   }

   public int i() {
      return this.g;
   }
}
