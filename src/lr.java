import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;

public class lr implements lw {
   private final lx<lr> a;
   private final int b;

   public static MapCodec<lr> a(lx<lr> $$0) {
      return ayu.j.xmap($$1 -> new lr($$0, $$1), $$0x -> $$0x.b).fieldOf("color");
   }

   public static yw<? super ByteBuf, lr> b(lx<lr> $$0) {
      return yu.g.a($$1 -> new lr($$0, $$1), $$0x -> $$0x.b);
   }

   private lr(lx<lr> $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public lx<lr> a() {
      return this.a;
   }

   public float b() {
      return (float)axw.b(this.b) / 255.0F;
   }

   public float c() {
      return (float)axw.c(this.b) / 255.0F;
   }

   public float d() {
      return (float)axw.d(this.b) / 255.0F;
   }

   public float e() {
      return (float)axw.a(this.b) / 255.0F;
   }

   public static lr a(lx<lr> $$0, int $$1) {
      return new lr($$0, $$1);
   }

   public static lr a(lx<lr> $$0, float $$1, float $$2, float $$3) {
      return a($$0, axw.a(1.0F, $$1, $$2, $$3));
   }
}
