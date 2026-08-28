import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;

public class lg implements ll {
   private final lm<lg> a;
   private final int b;

   public static MapCodec<lg> a(lm<lg> $$0) {
      return ayl.i.xmap($$1 -> new lg($$0, $$1), $$0x -> $$0x.b).fieldOf("color");
   }

   public static zb<? super ByteBuf, lg> b(lm<lg> $$0) {
      return yz.f.a($$1 -> new lg($$0, $$1), $$0x -> $$0x.b);
   }

   private lg(lm<lg> $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public lm<lg> a() {
      return this.a;
   }

   public float b() {
      return (float)axn.b(this.b) / 255.0F;
   }

   public float c() {
      return (float)axn.c(this.b) / 255.0F;
   }

   public float d() {
      return (float)axn.d(this.b) / 255.0F;
   }

   public float e() {
      return (float)axn.a(this.b) / 255.0F;
   }

   public static lg a(lm<lg> $$0, int $$1) {
      return new lg($$0, $$1);
   }

   public static lg a(lm<lg> $$0, float $$1, float $$2, float $$3) {
      return a($$0, axn.a(1.0F, $$1, $$2, $$3));
   }
}
