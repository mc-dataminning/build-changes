import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public record ua(double c) implements up {
   private static final int v = 16;
   public static final ua a = new ua(0.0);
   public static final va<ua> b = new va.a<ua>() {
      public ua a(DataInput $$0, ui $$1) throws IOException {
         return ua.a(d($$0, $$1));
      }

      @Override
      public uv.b a(DataInput $$0, uv $$1, ui $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static double d(DataInput $$0, ui $$1) throws IOException {
         $$1.b(16L);
         return $$0.readDouble();
      }

      @Override
      public int c() {
         return 8;
      }

      @Override
      public String a() {
         return "DOUBLE";
      }

      @Override
      public String b() {
         return "TAG_Double";
      }
   };

   @Deprecated(
      forRemoval = true
   )
   public ua(double c) {
      this.c = c;
   }

   public static ua a(double $$0) {
      return $$0 == 0.0 ? a : new ua($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeDouble(this.c);
   }

   @Override
   public int a() {
      return 16;
   }

   @Override
   public byte b() {
      return 6;
   }

   @Override
   public va<ua> c() {
      return b;
   }

   public ua e() {
      return this;
   }

   @Override
   public void a(vc $$0) {
      $$0.a(this);
   }

   @Override
   public long g() {
      return (long)Math.floor(this.c);
   }

   @Override
   public int h() {
      return azo.a(this.c);
   }

   @Override
   public short i() {
      return (short)(azo.a(this.c) & 65535);
   }

   @Override
   public byte j() {
      return (byte)(azo.a(this.c) & 0xFF);
   }

   @Override
   public double k() {
      return this.c;
   }

   @Override
   public float l() {
      return (float)this.c;
   }

   @Override
   public Number m() {
      return this.c;
   }

   @Override
   public uv.b a(uv $$0) {
      return $$0.a(this.c);
   }

   @Override
   public String toString() {
      ux $$0 = new ux();
      $$0.a(this);
      return $$0.a();
   }

   public double n() {
      return this.c;
   }
}
