import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;

public class lb implements lh {
   private final li<lb> a;
   private final int b;

   public static MapCodec<lb> a(li<lb> $$0) {
      return ayc.i.xmap($$1 -> new lb($$0, $$1), $$0x -> $$0x.b).fieldOf("color");
   }

   public static zj<? super ByteBuf, lb> b(li<lb> $$0) {
      return zh.f.a($$1 -> new lb($$0, $$1), $$0x -> $$0x.b);
   }

   private lb(li<lb> $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public li<lb> a() {
      return this.a;
   }

   public float b() {
      return (float)aye.b.b(this.b) / 255.0F;
   }

   public float c() {
      return (float)aye.b.c(this.b) / 255.0F;
   }

   public float d() {
      return (float)aye.b.d(this.b) / 255.0F;
   }

   public float e() {
      return (float)aye.b.a(this.b) / 255.0F;
   }

   public static lb a(li<lb> $$0, int $$1) {
      return new lb($$0, $$1);
   }

   public static lb a(li<lb> $$0, float $$1, float $$2, float $$3) {
      return a($$0, aye.b.a(1.0F, $$1, $$2, $$3));
   }
}
