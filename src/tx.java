import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public record tx(byte v) implements up {
   private static final int w = 9;
   public static final va<tx> a = new va.a<tx>() {
      public tx a(DataInput $$0, ui $$1) throws IOException {
         return tx.a(d($$0, $$1));
      }

      @Override
      public uv.b a(DataInput $$0, uv $$1, ui $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static byte d(DataInput $$0, ui $$1) throws IOException {
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
   public static final tx b = a((byte)0);
   public static final tx c = a((byte)1);

   @Deprecated(
      forRemoval = true
   )
   public tx(byte v) {
      this.v = v;
   }

   public static tx a(byte $$0) {
      return tx.a.a[128 + $$0];
   }

   public static tx a(boolean $$0) {
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
   public va<tx> c() {
      return a;
   }

   public tx e() {
      return this;
   }

   @Override
   public void a(vc $$0) {
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
   public uv.b a(uv $$0) {
      return $$0.a(this.v);
   }

   @Override
   public String toString() {
      ux $$0 = new ux();
      $$0.a(this);
      return $$0.a();
   }

   public byte n() {
      return this.v;
   }

   static class a {
      static final tx[] a = new tx[256];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new tx((byte)($$0 - 128));
         }
      }
   }
}
