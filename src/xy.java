public class xy implements ux<wp> {
   private final double a;
   private final double b;
   private final double c;
   private final double d;
   private final long e;
   private final int f;
   private final int g;
   private final int h;

   public xy(si $$0) {
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.n();
      this.f = $$0.m();
      this.g = $$0.m();
      this.h = $$0.m();
   }

   public xy(dgr $$0) {
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
   public void a(si $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.c(this.f);
      $$0.c(this.g);
      $$0.c(this.h);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public double a() {
      return this.a;
   }

   public double d() {
      return this.b;
   }

   public double e() {
      return this.d;
   }

   public double f() {
      return this.c;
   }

   public long g() {
      return this.e;
   }

   public int h() {
      return this.f;
   }

   public int i() {
      return this.h;
   }

   public int j() {
      return this.g;
   }
}
