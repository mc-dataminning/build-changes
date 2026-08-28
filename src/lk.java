import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;

public class lk implements lp {
   private final lq<lk> a;
   private final int b;

   public static MapCodec<lk> a(lq<lk> $$0) {
      return ayt.j.xmap($$1 -> new lk($$0, $$1), $$0x -> $$0x.b).fieldOf("color");
   }

   public static zg<? super ByteBuf, lk> b(lq<lk> $$0) {
      return ze.g.a($$1 -> new lk($$0, $$1), $$0x -> $$0x.b);
   }

   private lk(lq<lk> $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public lq<lk> a() {
      return this.a;
   }

   public float b() {
      return (float)axv.b(this.b) / 255.0F;
   }

   public float c() {
      return (float)axv.c(this.b) / 255.0F;
   }

   public float d() {
      return (float)axv.d(this.b) / 255.0F;
   }

   public float e() {
      return (float)axv.a(this.b) / 255.0F;
   }

   public static lk a(lq<lk> $$0, int $$1) {
      return new lk($$0, $$1);
   }

   public static lk a(lq<lk> $$0, float $$1, float $$2, float $$3) {
      return a($$0, axv.a(1.0F, $$1, $$2, $$3));
   }
}
