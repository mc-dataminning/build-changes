import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public record us(short b) implements up {
   private static final int c = 10;
   public static final va<us> a = new va.a<us>() {
      public us a(DataInput $$0, ui $$1) throws IOException {
         return us.a(d($$0, $$1));
      }

      @Override
      public uv.b a(DataInput $$0, uv $$1, ui $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static short d(DataInput $$0, ui $$1) throws IOException {
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
   };

   @Deprecated(
      forRemoval = true
   )
   public us(short b) {
      this.b = b;
   }

   public static us a(short $$0) {
      return $$0 >= -128 && $$0 <= 1024 ? us.a.a[$$0 - -128] : new us($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeShort(this.b);
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
   public va<us> c() {
      return a;
   }

   public us e() {
      return this;
   }

   @Override
   public void a(vc $$0) {
      $$0.a(this);
   }

   @Override
   public long g() {
      return (long)this.b;
   }

   @Override
   public int h() {
      return this.b;
   }

   @Override
   public short i() {
      return this.b;
   }

   @Override
   public byte j() {
      return (byte)(this.b & 255);
   }

   @Override
   public double k() {
      return (double)this.b;
   }

   @Override
   public float l() {
      return (float)this.b;
   }

   @Override
   public Number m() {
      return this.b;
   }

   @Override
   public uv.b a(uv $$0) {
      return $$0.a(this.b);
   }

   @Override
   public String toString() {
      ux $$0 = new ux();
      $$0.a(this);
      return $$0.a();
   }

   public short n() {
      return this.b;
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final us[] a = new us[1153];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new us((short)(-128 + $$0));
         }
      }
   }
}
