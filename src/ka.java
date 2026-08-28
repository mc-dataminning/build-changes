import io.netty.buffer.ByteBuf;

public class ka {
   public static final zn<ByteBuf, ka> a = new zn<ByteBuf, ka>() {
      public ka a(ByteBuf $$0) {
         return new ka($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
      }

      public void a(ByteBuf $$0, ka $$1) {
         $$0.writeFloat($$1.b);
         $$0.writeFloat($$1.c);
         $$0.writeFloat($$1.d);
      }
   };
   protected final float b;
   protected final float c;
   protected final float d;

   public ka(float $$0, float $$1, float $$2) {
      this.b = !Float.isInfinite($$0) && !Float.isNaN($$0) ? $$0 % 360.0F : 0.0F;
      this.c = !Float.isInfinite($$1) && !Float.isNaN($$1) ? $$1 % 360.0F : 0.0F;
      this.d = !Float.isInfinite($$2) && !Float.isNaN($$2) ? $$2 % 360.0F : 0.0F;
   }

   public ka(uy $$0) {
      this($$0.i(0), $$0.i(1), $$0.i(2));
   }

   public uy a() {
      uy $$0 = new uy();
      $$0.add(uv.a(this.b));
      $$0.add(uv.a(this.c));
      $$0.add(uv.a(this.d));
      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof ka $$1) ? false : this.b == $$1.b && this.c == $$1.c && this.d == $$1.d;
   }

   public float b() {
      return this.b;
   }

   public float c() {
      return this.c;
   }

   public float d() {
      return this.d;
   }

   public float e() {
      return ayz.g(this.b);
   }

   public float f() {
      return ayz.g(this.c);
   }

   public float g() {
      return ayz.g(this.d);
   }
}
