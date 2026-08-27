import io.netty.buffer.ByteBuf;

public class ja {
   public static final xo<ByteBuf, ja> a = new xo<ByteBuf, ja>() {
      public ja a(ByteBuf $$0) {
         return new ja($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
      }

      public void a(ByteBuf $$0, ja $$1) {
         $$0.writeFloat($$1.b);
         $$0.writeFloat($$1.c);
         $$0.writeFloat($$1.d);
      }
   };
   protected final float b;
   protected final float c;
   protected final float d;

   public ja(float $$0, float $$1, float $$2) {
      this.b = !Float.isInfinite($$0) && !Float.isNaN($$0) ? $$0 % 360.0F : 0.0F;
      this.c = !Float.isInfinite($$1) && !Float.isNaN($$1) ? $$1 % 360.0F : 0.0F;
      this.d = !Float.isInfinite($$2) && !Float.isNaN($$2) ? $$2 % 360.0F : 0.0F;
   }

   public ja(tc $$0) {
      this($$0.i(0), $$0.i(1), $$0.i(2));
   }

   public tc a() {
      tc $$0 = new tc();
      $$0.add(sz.a(this.b));
      $$0.add(sz.a(this.c));
      $$0.add(sz.a(this.d));
      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof ja $$1) ? false : this.b == $$1.b && this.c == $$1.c && this.d == $$1.d;
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
      return awi.g(this.b);
   }

   public float f() {
      return awi.g(this.c);
   }

   public float g() {
      return awi.g(this.d);
   }
}
