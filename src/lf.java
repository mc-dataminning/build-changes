import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;

public class lf implements lk {
   private final ll<lf> a;
   private final int b;

   public static MapCodec<lf> a(ll<lf> $$0) {
      return axv.i.xmap($$1 -> new lf($$0, $$1), $$0x -> $$0x.b).fieldOf("color");
   }

   public static yw<? super ByteBuf, lf> b(ll<lf> $$0) {
      return yu.f.a($$1 -> new lf($$0, $$1), $$0x -> $$0x.b);
   }

   private lf(ll<lf> $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ll<lf> a() {
      return this.a;
   }

   public float b() {
      return (float)axx.b.b(this.b) / 255.0F;
   }

   public float c() {
      return (float)axx.b.c(this.b) / 255.0F;
   }

   public float d() {
      return (float)axx.b.d(this.b) / 255.0F;
   }

   public float e() {
      return (float)axx.b.a(this.b) / 255.0F;
   }

   public static lf a(ll<lf> $$0, int $$1) {
      return new lf($$0, $$1);
   }

   public static lf a(ll<lf> $$0, float $$1, float $$2, float $$3) {
      return a($$0, axx.b.a(1.0F, $$1, $$2, $$3));
   }
}
