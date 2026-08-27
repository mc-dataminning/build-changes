import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class rd extends rm {
   private static final int b = 12;
   public static final ru<rd> a = new ru.a<rd>() {
      public rd a(DataInput $$0, rh $$1) throws IOException {
         return rd.a(d($$0, $$1));
      }

      @Override
      public rp.b a(DataInput $$0, rp $$1, rh $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static int d(DataInput $$0, rh $$1) throws IOException {
         $$1.b(12L);
         return $$0.readInt();
      }

      @Override
      public int c() {
         return 4;
      }

      @Override
      public String a() {
         return "INT";
      }

      @Override
      public String b() {
         return "TAG_Int";
      }

      @Override
      public boolean d() {
         return true;
      }
   };
   private final int c;

   rd(int $$0) {
      this.c = $$0;
   }

   public static rd a(int $$0) {
      return $$0 >= -128 && $$0 <= 1024 ? rd.a.a[$$0 - -128] : new rd($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeInt(this.c);
   }

   @Override
   public int a() {
      return 12;
   }

   @Override
   public byte b() {
      return 3;
   }

   @Override
   public ru<rd> c() {
      return a;
   }

   public rd e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof rd && this.c == ((rd)$$0).c;
   }

   @Override
   public int hashCode() {
      return this.c;
   }

   @Override
   public void a(rw $$0) {
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
      return (short)(this.c & 65535);
   }

   @Override
   public byte i() {
      return (byte)(this.c & 0xFF);
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
   public rp.b a(rp $$0) {
      return $$0.a(this.c);
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final rd[] a = new rd[1153];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new rd(-128 + $$0);
         }
      }
   }
}
