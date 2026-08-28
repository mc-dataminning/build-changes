import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;

public class lc implements lh {
   private final li<lc> a;
   private final int b;

   public static MapCodec<lc> a(li<lc> $$0) {
      return axo.i.xmap($$1 -> new lc($$0, $$1), $$0x -> $$0x.b).fieldOf("color");
   }

   public static ys<? super ByteBuf, lc> b(li<lc> $$0) {
      return yq.f.a($$1 -> new lc($$0, $$1), $$0x -> $$0x.b);
   }

   private lc(li<lc> $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public li<lc> a() {
      return this.a;
   }

   public float b() {
      return (float)axq.b.b(this.b) / 255.0F;
   }

   public float c() {
      return (float)axq.b.c(this.b) / 255.0F;
   }

   public float d() {
      return (float)axq.b.d(this.b) / 255.0F;
   }

   public float e() {
      return (float)axq.b.a(this.b) / 255.0F;
   }

   public static lc a(li<lc> $$0, int $$1) {
      return new lc($$0, $$1);
   }

   public static lc a(li<lc> $$0, float $$1, float $$2, float $$3) {
      return a($$0, axq.b.a(1.0F, $$1, $$2, $$3));
   }
}
