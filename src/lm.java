import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;

public class lm implements lr {
   private final ls<lm> a;
   private final int b;

   public static MapCodec<lm> a(ls<lm> $$0) {
      return ayi.j.xmap($$1 -> new lm($$0, $$1), $$0x -> $$0x.b).fieldOf("color");
   }

   public static yn<? super ByteBuf, lm> b(ls<lm> $$0) {
      return yl.g.a($$1 -> new lm($$0, $$1), $$0x -> $$0x.b);
   }

   private lm(ls<lm> $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ls<lm> a() {
      return this.a;
   }

   public float b() {
      return (float)axk.b(this.b) / 255.0F;
   }

   public float c() {
      return (float)axk.c(this.b) / 255.0F;
   }

   public float d() {
      return (float)axk.d(this.b) / 255.0F;
   }

   public float e() {
      return (float)axk.a(this.b) / 255.0F;
   }

   public static lm a(ls<lm> $$0, int $$1) {
      return new lm($$0, $$1);
   }

   public static lm a(ls<lm> $$0, float $$1, float $$2, float $$3) {
      return a($$0, axk.a(1.0F, $$1, $$2, $$3));
   }
}
