public class ym implements uo<ur> {
   public static final float a = 8.0F;
   private final he<amg> b;
   private final ami c;
   private final int d;
   private final int e;
   private final int f;
   private final float g;
   private final float h;
   private final long i;

   public ym(he<amg> $$0, ami $$1, double $$2, double $$3, double $$4, float $$5, float $$6, long $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = (int)($$2 * 8.0);
      this.e = (int)($$3 * 8.0);
      this.f = (int)($$4 * 8.0);
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public ym(sf $$0) {
      this.b = $$0.a(jb.c.t(), amg::b);
      this.c = $$0.b(ami.class);
      this.d = $$0.readInt();
      this.e = $$0.readInt();
      this.f = $$0.readInt();
      this.g = $$0.readFloat();
      this.h = $$0.readFloat();
      this.i = $$0.readLong();
   }

   @Override
   public void a(sf $$0) {
      $$0.a(jb.c.t(), this.b, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.c);
      $$0.writeInt(this.d);
      $$0.writeInt(this.e);
      $$0.writeInt(this.f);
      $$0.writeFloat(this.g);
      $$0.writeFloat(this.h);
      $$0.writeLong(this.i);
   }

   public he<amg> a() {
      return this.b;
   }

   public ami c() {
      return this.c;
   }

   public double d() {
      return (double)((float)this.d / 8.0F);
   }

   public double e() {
      return (double)((float)this.e / 8.0F);
   }

   public double f() {
      return (double)((float)this.f / 8.0F);
   }

   public float g() {
      return this.g;
   }

   public float h() {
      return this.h;
   }

   public long i() {
      return this.i;
   }

   public void a(ur $$0) {
      $$0.a(this);
   }
}
