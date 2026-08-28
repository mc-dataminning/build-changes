import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public record ud(float c) implements uq {
   private static final int v = 12;
   public static final ud a = new ud(0.0F);
   public static final vc<ud> b = new vc.a<ud>() {
      public ud a(DataInput $$0, uj $$1) throws IOException {
         return ud.a(d($$0, $$1));
      }

      @Override
      public ux.b a(DataInput $$0, ux $$1, uj $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static float d(DataInput $$0, uj $$1) throws IOException {
         $$1.b(12L);
         return $$0.readFloat();
      }

      @Override
      public int c() {
         return 4;
      }

      @Override
      public String a() {
         return "FLOAT";
      }

      @Override
      public String b() {
         return "TAG_Float";
      }
   };

   @Deprecated(
      forRemoval = true
   )
   public ud(float c) {
      this.c = c;
   }

   public static ud a(float $$0) {
      return $$0 == 0.0F ? a : new ud($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeFloat(this.c);
   }

   @Override
   public int a() {
      return 12;
   }

   @Override
   public byte b() {
      return 5;
   }

   @Override
   public vc<ud> c() {
      return b;
   }

   public ud e() {
      return this;
   }

   @Override
   public void a(ve $$0) {
      $$0.a(this);
   }

   @Override
   public long g() {
      return (long)this.c;
   }

   @Override
   public int h() {
      return azz.d(this.c);
   }

   @Override
   public short i() {
      return (short)(azz.d(this.c) & 65535);
   }

   @Override
   public byte j() {
      return (byte)(azz.d(this.c) & 0xFF);
   }

   @Override
   public double k() {
      return (double)this.c;
   }

   @Override
   public float l() {
      return this.c;
   }

   @Override
   public Number m() {
      return this.c;
   }

   @Override
   public ux.b a(ux $$0) {
      return $$0.a(this.c);
   }

   @Override
   public String toString() {
      uz $$0 = new uz();
      $$0.a(this);
      return $$0.a();
   }

   public float n() {
      return this.c;
   }
}
