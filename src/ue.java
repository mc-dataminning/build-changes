import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public record ue(int b) implements up {
   private static final int c = 12;
   public static final va<ue> a = new va.a<ue>() {
      public ue a(DataInput $$0, ui $$1) throws IOException {
         return ue.a(d($$0, $$1));
      }

      @Override
      public uv.b a(DataInput $$0, uv $$1, ui $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static int d(DataInput $$0, ui $$1) throws IOException {
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
   };

   @Deprecated(
      forRemoval = true
   )
   public ue(int b) {
      this.b = b;
   }

   public static ue a(int $$0) {
      return $$0 >= -128 && $$0 <= 1024 ? ue.a.a[$$0 - -128] : new ue($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeInt(this.b);
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
   public va<ue> c() {
      return a;
   }

   public ue e() {
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
      return (short)(this.b & 65535);
   }

   @Override
   public byte j() {
      return (byte)(this.b & 0xFF);
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

   public int n() {
      return this.b;
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final ue[] a = new ue[1153];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new ue(-128 + $$0);
         }
      }
   }
}
