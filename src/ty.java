import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public record ty(byte v) implements uq {
   private static final int w = 9;
   public static final vc<ty> a = new vc.a<ty>() {
      public ty a(DataInput $$0, uj $$1) throws IOException {
         return ty.a(d($$0, $$1));
      }

      @Override
      public ux.b a(DataInput $$0, ux $$1, uj $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static byte d(DataInput $$0, uj $$1) throws IOException {
         $$1.b(9L);
         return $$0.readByte();
      }

      @Override
      public int c() {
         return 1;
      }

      @Override
      public String a() {
         return "BYTE";
      }

      @Override
      public String b() {
         return "TAG_Byte";
      }
   };
   public static final ty b = a((byte)0);
   public static final ty c = a((byte)1);

   @Deprecated(
      forRemoval = true
   )
   public ty(byte v) {
      this.v = v;
   }

   public static ty a(byte $$0) {
      return ty.a.a[128 + $$0];
   }

   public static ty a(boolean $$0) {
      return $$0 ? c : b;
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeByte(this.v);
   }

   @Override
   public int a() {
      return 9;
   }

   @Override
   public byte b() {
      return 1;
   }

   @Override
   public vc<ty> c() {
      return a;
   }

   public ty e() {
      return this;
   }

   @Override
   public void a(ve $$0) {
      $$0.a(this);
   }

   @Override
   public long g() {
      return (long)this.v;
   }

   @Override
   public int h() {
      return this.v;
   }

   @Override
   public short i() {
      return (short)this.v;
   }

   @Override
   public byte j() {
      return this.v;
   }

   @Override
   public double k() {
      return (double)this.v;
   }

   @Override
   public float l() {
      return (float)this.v;
   }

   @Override
   public Number m() {
      return this.v;
   }

   @Override
   public ux.b a(ux $$0) {
      return $$0.a(this.v);
   }

   @Override
   public String toString() {
      uz $$0 = new uz();
      $$0.a(this);
      return $$0.a();
   }

   public byte n() {
      return this.v;
   }

   static class a {
      static final ty[] a = new ty[256];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new ty((byte)($$0 - 128));
         }
      }
   }
}
