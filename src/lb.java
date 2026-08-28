import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;

public class lb implements lg {
   private final lh<lb> a;
   private final int b;

   public static MapCodec<lb> a(lh<lb> $$0) {
      return ayg.i.xmap($$1 -> new lb($$0, $$1), $$0x -> $$0x.b).fieldOf("color");
   }

   public static zm<? super ByteBuf, lb> b(lh<lb> $$0) {
      return zk.f.a($$1 -> new lb($$0, $$1), $$0x -> $$0x.b);
   }

   private lb(lh<lb> $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public lh<lb> a() {
      return this.a;
   }

   public float b() {
      return (float)ayi.b.b(this.b) / 255.0F;
   }

   public float c() {
      return (float)ayi.b.c(this.b) / 255.0F;
   }

   public float d() {
      return (float)ayi.b.d(this.b) / 255.0F;
   }

   public float e() {
      return (float)ayi.b.a(this.b) / 255.0F;
   }

   public static lb a(lh<lb> $$0, int $$1) {
      return new lb($$0, $$1);
   }

   public static lb a(lh<lb> $$0, float $$1, float $$2, float $$3) {
      return a($$0, ayi.b.a(1.0F, $$1, $$2, $$3));
   }
}
