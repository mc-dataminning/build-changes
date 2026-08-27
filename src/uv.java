import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class uv extends ut {
   private static final int b = 10;
   public static final vc<uv> a = new vc.a<uv>() {
      public uv a(DataInput $$0, um $$1) throws IOException {
         return uv.a(d($$0, $$1));
      }

      @Override
      public ux.b a(DataInput $$0, ux $$1, um $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static short d(DataInput $$0, um $$1) throws IOException {
         $$1.b(10L);
         return $$0.readShort();
      }

      @Override
      public int c() {
         return 2;
      }

      @Override
      public String a() {
         return "SHORT";
      }

      @Override
      public String b() {
         return "TAG_Short";
      }

      @Override
      public boolean d() {
         return true;
      }
   };
   private final short c;

   uv(short $$0) {
      this.c = $$0;
   }

   public static uv a(short $$0) {
      return $$0 >= -128 && $$0 <= 1024 ? uv.a.a[$$0 - -128] : new uv($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeShort(this.c);
   }

   @Override
   public int a() {
      return 10;
   }

   @Override
   public byte b() {
      return 2;
   }

   @Override
   public vc<uv> c() {
      return a;
   }

   public uv e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof uv && this.c == ((uv)$$0).c;
   }

   @Override
   public int hashCode() {
      return this.c;
   }

   @Override
   public void a(ve $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)this.c;
   }

   @Override
   public int g() {
      return this.c;
   }

   @Override
   public short h() {
      return this.c;
   }

   @Override
   public byte i() {
      return (byte)(this.c & 255);
   }

   @Override
   public double j() {
      return (double)this.c;
   }

   @Override
   public float k() {
      return (float)this.c;
   }

   @Override
   public Number l() {
      return this.c;
   }

   @Override
   public ux.b a(ux $$0) {
      return $$0.a(this.c);
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final uv[] a = new uv[1153];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new uv((short)(-128 + $$0));
         }
      }
   }
}
