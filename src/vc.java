import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class vc extends va {
   private static final int b = 10;
   public static final vj<vc> a = new vj.a<vc>() {
      public vc a(DataInput $$0, ut $$1) throws IOException {
         return vc.a(d($$0, $$1));
      }

      @Override
      public ve.b a(DataInput $$0, ve $$1, ut $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static short d(DataInput $$0, ut $$1) throws IOException {
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

   vc(short $$0) {
      this.c = $$0;
   }

   public static vc a(short $$0) {
      return $$0 >= -128 && $$0 <= 1024 ? vc.a.a[$$0 - -128] : new vc($$0);
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
   public vj<vc> c() {
      return a;
   }

   public vc e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof vc && this.c == ((vc)$$0).c;
   }

   @Override
   public int hashCode() {
      return this.c;
   }

   @Override
   public void a(vl $$0) {
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
   public ve.b a(ve $$0) {
      return $$0.a(this.c);
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final vc[] a = new vc[1153];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new vc((short)(-128 + $$0));
         }
      }
   }
}
