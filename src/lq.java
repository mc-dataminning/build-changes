import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;

public class lq implements lv {
   private final lw<lq> a;
   private final int b;

   public static MapCodec<lq> a(lw<lq> $$0) {
      return ays.j.xmap($$1 -> new lq($$0, $$1), $$0x -> $$0x.b).fieldOf("color");
   }

   public static yu<? super ByteBuf, lq> b(lw<lq> $$0) {
      return ys.g.a($$1 -> new lq($$0, $$1), $$0x -> $$0x.b);
   }

   private lq(lw<lq> $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public lw<lq> a() {
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

   public static lq a(lw<lq> $$0, int $$1) {
      return new lq($$0, $$1);
   }

   public static lq a(lw<lq> $$0, float $$1, float $$2, float $$3) {
      return a($$0, axu.a(1.0F, $$1, $$2, $$3));
   }
}
