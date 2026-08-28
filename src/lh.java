import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;

public class lh implements lm {
   private final ln<lh> a;
   private final int b;

   public static MapCodec<lh> a(ln<lh> $$0) {
      return ayo.i.xmap($$1 -> new lh($$0, $$1), $$0x -> $$0x.b).fieldOf("color");
   }

   public static zc<? super ByteBuf, lh> b(ln<lh> $$0) {
      return za.g.a($$1 -> new lh($$0, $$1), $$0x -> $$0x.b);
   }

   private lh(ln<lh> $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ln<lh> a() {
      return this.a;
   }

   public float b() {
      return (float)axq.b(this.b) / 255.0F;
   }

   public float c() {
      return (float)axq.c(this.b) / 255.0F;
   }

   public float d() {
      return (float)axq.d(this.b) / 255.0F;
   }

   public float e() {
      return (float)axq.a(this.b) / 255.0F;
   }

   public static lh a(ln<lh> $$0, int $$1) {
      return new lh($$0, $$1);
   }

   public static lh a(ln<lh> $$0, float $$1, float $$2, float $$3) {
      return a($$0, axq.a(1.0F, $$1, $$2, $$3));
   }
}
