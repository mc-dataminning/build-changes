public class yi implements vd<ww> {
   private final double a;
   private final double b;
   private final double c;
   private final float d;
   private final float e;
   private final float f;
   private final float g;
   private final int h;
   private final boolean i;
   private final it j;

   public <T extends it> yi(T $$0, boolean $$1, double $$2, double $$3, double $$4, float $$5, float $$6, float $$7, float $$8, int $$9) {
      this.j = $$0;
      this.i = $$1;
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = $$5;
      this.e = $$6;
      this.f = $$7;
      this.g = $$8;
      this.h = $$9;
   }

   public yi(so $$0) {
      iu<?> $$1 = $$0.a(jb.k);
      this.i = $$0.readBoolean();
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readFloat();
      this.h = $$0.readInt();
      this.j = this.a($$0, (iu<it>)$$1);
   }

   private <T extends it> T a(so $$0, iu<T> $$1) {
      return $$1.d().b($$1, $$0);
   }

   @Override
   public void a(so $$0) {
      $$0.a(jb.k, this.j.b());
      $$0.a(this.i);
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.p(this.h);
      this.j.a($$0);
   }

   public boolean a() {
      return this.i;
   }

   public double d() {
      return this.a;
   }

   public double e() {
      return this.b;
   }

   public double f() {
      return this.c;
   }

   public float g() {
      return this.d;
   }

   public float h() {
      return this.e;
   }

   public float i() {
      return this.f;
   }

   public float j() {
      return this.g;
   }

   public int k() {
      return this.h;
   }

   public it l() {
      return this.j;
   }

   public void a(ww $$0) {
      $$0.a(this);
   }
}
