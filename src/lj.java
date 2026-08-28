import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;

public class lj implements lo {
   private final lp<lj> a;
   private final int b;

   public static MapCodec<lj> a(lp<lj> $$0) {
      return ays.j.xmap($$1 -> new lj($$0, $$1), $$0x -> $$0x.b).fieldOf("color");
   }

   public static zf<? super ByteBuf, lj> b(lp<lj> $$0) {
      return zd.g.a($$1 -> new lj($$0, $$1), $$0x -> $$0x.b);
   }

   private lj(lp<lj> $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public lp<lj> a() {
      return this.a;
   }

   public float b() {
      return (float)axu.b(this.b) / 255.0F;
   }

   public float c() {
      return (float)axu.c(this.b) / 255.0F;
   }

   public float d() {
      return (float)axu.d(this.b) / 255.0F;
   }

   public float e() {
      return (float)axu.a(this.b) / 255.0F;
   }

   public static lj a(lp<lj> $$0, int $$1) {
      return new lj($$0, $$1);
   }

   public static lj a(lp<lj> $$0, float $$1, float $$2, float $$3) {
      return a($$0, axu.a(1.0F, $$1, $$2, $$3));
   }
}
