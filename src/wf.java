public class wf implements uo<ur> {
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

   public <T extends it> wf(T $$0, boolean $$1, double $$2, double $$3, double $$4, float $$5, float $$6, float $$7, float $$8, int $$9) {
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

   public wf(sf $$0) {
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

   private <T extends it> T a(sf $$0, iu<T> $$1) {
      return $$1.d().b($$1, $$0);
   }

   @Override
   public void a(sf $$0) {
      $$0.a(jb.k, this.j.b());
      $$0.writeBoolean(this.i);
      $$0.writeDouble(this.a);
      $$0.writeDouble(this.b);
      $$0.writeDouble(this.c);
      $$0.writeFloat(this.d);
      $$0.writeFloat(this.e);
      $$0.writeFloat(this.f);
      $$0.writeFloat(this.g);
      $$0.writeInt(this.h);
      this.j.a($$0);
   }

   public boolean a() {
      return this.i;
   }

   public double c() {
      return this.a;
   }

   public double d() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   public float f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }

   public float h() {
      return this.f;
   }

   public float i() {
      return this.g;
   }

   public int j() {
      return this.h;
   }

   public it k() {
      return this.j;
   }

   public void a(ur $$0) {
      $$0.a(this);
   }
}
