import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public record uc(float c) implements up {
   private static final int v = 12;
   public static final uc a = new uc(0.0F);
   public static final va<uc> b = new va.a<uc>() {
      public uc a(DataInput $$0, ui $$1) throws IOException {
         return uc.a(d($$0, $$1));
      }

      @Override
      public uv.b a(DataInput $$0, uv $$1, ui $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static float d(DataInput $$0, ui $$1) throws IOException {
         $$1.b(12L);
         return $$0.readFloat();
      }

      @Override
      public int c() {
         return 4;
      }

      @Override
      public String a() {
         return "FLOAT";
      }

      @Override
      public String b() {
         return "TAG_Float";
      }
   };

   @Deprecated(
      forRemoval = true
   )
   public uc(float c) {
      this.c = c;
   }

   public static uc a(float $$0) {
      return $$0 == 0.0F ? a : new uc($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeFloat(this.c);
   }

   @Override
   public int a() {
      return 12;
   }

   @Override
   public byte b() {
      return 5;
   }

   @Override
   public va<uc> c() {
      return b;
   }

   public uc e() {
      return this;
   }

   @Override
   public void a(vc $$0) {
      $$0.a(this);
   }

   @Override
   public long g() {
      return (long)this.c;
   }

   @Override
   public int h() {
      return azo.d(this.c);
   }

   @Override
   public short i() {
      return (short)(azo.d(this.c) & 65535);
   }

   @Override
   public byte j() {
      return (byte)(azo.d(this.c) & 0xFF);
   }

   @Override
   public double k() {
      return (double)this.c;
   }

   @Override
   public float l() {
      return this.c;
   }

   @Override
   public Number m() {
      return this.c;
   }

   @Override
   public uv.b a(uv $$0) {
      return $$0.a(this.c);
   }

   @Override
   public String toString() {
      ux $$0 = new ux();
      $$0.a(this);
      return $$0.a();
   }

   public float n() {
      return this.c;
   }
}
