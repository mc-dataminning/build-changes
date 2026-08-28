import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class uw extends vh {
   private static final int b = 12;
   public static final vq<uw> a = new vq.a<uw>() {
      public uw a(DataInput $$0, va $$1) throws IOException {
         return uw.a(d($$0, $$1));
      }

      @Override
      public vl.b a(DataInput $$0, vl $$1, va $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static int d(DataInput $$0, va $$1) throws IOException {
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

   uw(int $$0) {
      this.c = $$0;
   }

   public static uw a(int $$0) {
      return $$0 >= -128 && $$0 <= 1024 ? uw.a.a[$$0 - -128] : new uw($$0);
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
   public vq<uw> c() {
      return a;
   }

   public uw e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof uw && this.c == ((uw)$$0).c;
   }

   @Override
   public int hashCode() {
      return this.c;
   }

   @Override
   public void a(vs $$0) {
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
   public vl.b a(vl $$0) {
      return $$0.a(this.c);
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final uw[] a = new uw[1153];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new uw(-128 + $$0);
         }
      }
   }
}
