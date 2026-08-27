public abstract class zx implements uo<zb> {
   protected final double a;
   protected final double b;
   protected final double c;
   protected final float d;
   protected final float e;
   protected final boolean f;
   protected final boolean g;
   protected final boolean h;

   protected zx(double $$0, double $$1, double $$2, float $$3, float $$4, boolean $$5, boolean $$6, boolean $$7) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public double a(double $$0) {
      return this.g ? this.a : $$0;
   }

   public double b(double $$0) {
      return this.g ? this.b : $$0;
   }

   public double c(double $$0) {
      return this.g ? this.c : $$0;
   }

   public float a(float $$0) {
      return this.h ? this.d : $$0;
   }

   public float b(float $$0) {
      return this.h ? this.e : $$0;
   }

   public boolean a() {
      return this.f;
   }

   public boolean c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }

   public static class a extends zx {
      public a(double $$0, double $$1, double $$2, boolean $$3) {
         super($$0, $$1, $$2, 0.0F, 0.0F, $$3, true, false);
      }

      public static zx.a b(sf $$0) {
         double $$1 = $$0.readDouble();
         double $$2 = $$0.readDouble();
         double $$3 = $$0.readDouble();
         boolean $$4 = $$0.readUnsignedByte() != 0;
         return new zx.a($$1, $$2, $$3, $$4);
      }

      @Override
      public void a(sf $$0) {
         $$0.writeDouble(this.a);
         $$0.writeDouble(this.b);
         $$0.writeDouble(this.c);
         $$0.writeByte(this.f ? 1 : 0);
      }
   }

   public static class b extends zx {
      public b(double $$0, double $$1, double $$2, float $$3, float $$4, boolean $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5, true, true);
      }

      public static zx.b b(sf $$0) {
         double $$1 = $$0.readDouble();
         double $$2 = $$0.readDouble();
         double $$3 = $$0.readDouble();
         float $$4 = $$0.readFloat();
         float $$5 = $$0.readFloat();
         boolean $$6 = $$0.readUnsignedByte() != 0;
         return new zx.b($$1, $$2, $$3, $$4, $$5, $$6);
      }

      @Override
      public void a(sf $$0) {
         $$0.writeDouble(this.a);
         $$0.writeDouble(this.b);
         $$0.writeDouble(this.c);
         $$0.writeFloat(this.d);
         $$0.writeFloat(this.e);
         $$0.writeByte(this.f ? 1 : 0);
      }
   }

   public static class c extends zx {
      public c(float $$0, float $$1, boolean $$2) {
         super(0.0, 0.0, 0.0, $$0, $$1, $$2, false, true);
      }

      public static zx.c b(sf $$0) {
         float $$1 = $$0.readFloat();
         float $$2 = $$0.readFloat();
         boolean $$3 = $$0.readUnsignedByte() != 0;
         return new zx.c($$1, $$2, $$3);
      }

      @Override
      public void a(sf $$0) {
         $$0.writeFloat(this.d);
         $$0.writeFloat(this.e);
         $$0.writeByte(this.f ? 1 : 0);
      }
   }

   public static class d extends zx {
      public d(boolean $$0) {
         super(0.0, 0.0, 0.0, 0.0F, 0.0F, $$0, false, false);
      }

      public static zx.d b(sf $$0) {
         boolean $$1 = $$0.readUnsignedByte() != 0;
         return new zx.d($$1);
      }

      @Override
      public void a(sf $$0) {
         $$0.writeByte(this.f ? 1 : 0);
      }
   }
}
