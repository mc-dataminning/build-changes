import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ue extends uw {
   private static final int w = 9;
   public static final vf<ue> a = new vf.a<ue>() {
      public ue a(DataInput $$0, up $$1) throws IOException {
         return ue.a(d($$0, $$1));
      }

      @Override
      public va.b a(DataInput $$0, va $$1, up $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static byte d(DataInput $$0, up $$1) throws IOException {
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
   public static final ue b = a((byte)0);
   public static final ue c = a((byte)1);
   private final byte x;

   ue(byte $$0) {
      this.x = $$0;
   }

   public static ue a(byte $$0) {
      return ue.a.a[128 + $$0];
   }

   public static ue a(boolean $$0) {
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
   public vf<ue> c() {
      return a;
   }

   public ue e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof ue && this.x == ((ue)$$0).x;
   }

   @Override
   public int hashCode() {
      return this.x;
   }

   @Override
   public void a(vh $$0) {
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
   public va.b a(va $$0) {
      return $$0.a(this.x);
   }

   static class a {
      static final ue[] a = new ue[256];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new ue((byte)($$0 - 128));
         }
      }
   }
}
