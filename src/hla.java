import javax.annotation.Nullable;

public class hla {
   private final ali a;
   private final hku b;
   final int c;
   final int d;
   private final float e;
   private final float f;
   private final float g;
   private final float h;

   protected hla(ali $$0, hku $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$4;
      this.d = $$5;
      this.e = (float)$$4 / (float)$$2;
      this.f = (float)($$4 + $$1.a()) / (float)$$2;
      this.g = (float)$$5 / (float)$$3;
      this.h = (float)($$5 + $$1.b()) / (float)$$3;
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public float d() {
      return this.f;
   }

   public hku e() {
      return this.b;
   }

   @Nullable
   public hla.a f() {
      final hkw $$0 = this.b.e();
      return $$0 != null ? new hla.a() {
         @Override
         public void a(flh $$0x) {
            $$0.a(hla.this.c, hla.this.d, $$0);
         }

         @Override
         public void close() {
            $$0.close();
         }
      } : null;
   }

   public float a(float $$0) {
      float $$1 = this.f - this.e;
      return this.e + $$1 * $$0;
   }

   public float b(float $$0) {
      float $$1 = this.f - this.e;
      return ($$0 - this.e) / $$1;
   }

   public float g() {
      return this.g;
   }

   public float h() {
      return this.h;
   }

   public float c(float $$0) {
      float $$1 = this.h - this.g;
      return this.g + $$1 * $$0;
   }

   public float d(float $$0) {
      float $$1 = this.h - this.g;
      return ($$0 - this.g) / $$1;
   }

   public ali i() {
      return this.a;
   }

   @Override
   public String toString() {
      return "TextureAtlasSprite{contents='" + this.b + "', u0=" + this.e + ", u1=" + this.f + ", v0=" + this.g + ", v1=" + this.h + "}";
   }

   public void a(flh $$0) {
      this.b.a(this.c, this.d, $$0);
   }

   private float k() {
      float $$0 = (float)this.b.a() / (this.f - this.e);
      float $$1 = (float)this.b.b() / (this.h - this.g);
      return Math.max($$1, $$0);
   }

   public float j() {
      return 4.0F / this.k();
   }

   public flr a(flr $$0) {
      return new gsx($$0, this);
   }

   public interface a extends AutoCloseable {
      void a(flh var1);

      @Override
      void close();
   }
}
