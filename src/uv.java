import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class uv extends vn {
   private static final int w = 9;
   public static final vw<uv> a = new vw.a<uv>() {
      public uv a(DataInput $$0, vg $$1) throws IOException {
         return uv.a(d($$0, $$1));
      }

      @Override
      public vr.b a(DataInput $$0, vr $$1, vg $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static byte d(DataInput $$0, vg $$1) throws IOException {
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

      @Override
      public boolean d() {
         return true;
      }
   };
   public static final uv b = a((byte)0);
   public static final uv c = a((byte)1);
   private final byte x;

   uv(byte $$0) {
      this.x = $$0;
   }

   public static uv a(byte $$0) {
      return uv.a.a[128 + $$0];
   }

   public static uv a(boolean $$0) {
      return $$0 ? c : b;
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeByte(this.x);
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
   public vw<uv> c() {
      return a;
   }

   public uv e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof uv && this.x == ((uv)$$0).x;
   }

   @Override
   public int hashCode() {
      return this.x;
   }

   @Override
   public void a(vy $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)this.x;
   }

   @Override
   public int g() {
      return this.x;
   }

   @Override
   public short h() {
      return (short)this.x;
   }

   @Override
   public byte i() {
      return this.x;
   }

   @Override
   public double j() {
      return (double)this.x;
   }

   @Override
   public float k() {
      return (float)this.x;
   }

   @Override
   public Number l() {
      return this.x;
   }

   @Override
   public vr.b a(vr $$0) {
      return $$0.a(this.x);
   }

   static class a {
      static final uv[] a = new uv[256];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new uv((byte)($$0 - 128));
         }
      }
   }
}
