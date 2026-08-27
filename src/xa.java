import java.util.Set;

public class xa implements uo<ur> {
   private final double a;
   private final double b;
   private final double c;
   private final float d;
   private final float e;
   private final Set<bgn> f;
   private final int g;

   public xa(double $$0, double $$1, double $$2, float $$3, float $$4, Set<bgn> $$5, int $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public xa(sf $$0) {
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
      this.f = bgn.a($$0.readUnsignedByte());
      this.g = $$0.m();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeDouble(this.a);
      $$0.writeDouble(this.b);
      $$0.writeDouble(this.c);
      $$0.writeFloat(this.d);
      $$0.writeFloat(this.e);
      $$0.writeByte(bgn.a(this.f));
      $$0.d(this.g);
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
      return this.c;
   }

   public float e() {
      return this.d;
   }

   public float f() {
      return this.e;
   }

   public int g() {
      return this.g;
   }

   public Set<bgn> h() {
      return this.f;
   }
}
