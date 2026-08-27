import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class su extends tm {
   private static final int w = 9;
   public static final tv<su> a = new tv.a<su>() {
      public su a(DataInput $$0, tf $$1) throws IOException {
         return su.a(d($$0, $$1));
      }

      @Override
      public tq.b a(DataInput $$0, tq $$1, tf $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static byte d(DataInput $$0, tf $$1) throws IOException {
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
   public static final su b = a((byte)0);
   public static final su c = a((byte)1);
   private final byte x;

   su(byte $$0) {
      this.x = $$0;
   }

   public static su a(byte $$0) {
      return su.a.a[128 + $$0];
   }

   public static su a(boolean $$0) {
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
   public tv<su> c() {
      return a;
   }

   public su e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof su && this.x == ((su)$$0).x;
   }

   @Override
   public int hashCode() {
      return this.x;
   }

   @Override
   public void a(tx $$0) {
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
   public tq.b a(tq $$0) {
      return $$0.a(this.x);
   }

   static class a {
      static final su[] a = new su[256];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new su((byte)($$0 - 128));
         }
      }
   }
}
