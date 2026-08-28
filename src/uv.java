import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class uv extends vi {
   private static final int c = 12;
   public static final uv a = new uv(0.0F);
   public static final vr<uv> b = new vr.a<uv>() {
      public uv a(DataInput $$0, vb $$1) throws IOException {
         return uv.a(d($$0, $$1));
      }

      @Override
      public vm.b a(DataInput $$0, vm $$1, vb $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static float d(DataInput $$0, vb $$1) throws IOException {
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

      @Override
      public boolean d() {
         return true;
      }
   };
   private final float w;

   private uv(float $$0) {
      this.w = $$0;
   }

   public static uv a(float $$0) {
      return $$0 == 0.0F ? a : new uv($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeFloat(this.w);
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
   public vr<uv> c() {
      return b;
   }

   public uv e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof uv && this.w == ((uv)$$0).w;
   }

   @Override
   public int hashCode() {
      return Float.floatToIntBits(this.w);
   }

   @Override
   public void a(vt $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)this.w;
   }

   @Override
   public int g() {
      return ayz.d(this.w);
   }

   @Override
   public short h() {
      return (short)(ayz.d(this.w) & 65535);
   }

   @Override
   public byte i() {
      return (byte)(ayz.d(this.w) & 0xFF);
   }

   @Override
   public double j() {
      return (double)this.w;
   }

   @Override
   public float k() {
      return this.w;
   }

   @Override
   public Number l() {
      return this.w;
   }

   @Override
   public vm.b a(vm $$0) {
      return $$0.a(this.w);
   }
}
