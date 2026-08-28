import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;

public class lo implements lt {
   private final lu<lo> a;
   private final int b;

   public static MapCodec<lo> a(lu<lo> $$0) {
      return ays.j.xmap($$1 -> new lo($$0, $$1), $$0x -> $$0x.b).fieldOf("color");
   }

   public static yt<? super ByteBuf, lo> b(lu<lo> $$0) {
      return yr.g.a($$1 -> new lo($$0, $$1), $$0x -> $$0x.b);
   }

   private lo(lu<lo> $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public lu<lo> a() {
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

   public static lo a(lu<lo> $$0, int $$1) {
      return new lo($$0, $$1);
   }

   public static lo a(lu<lo> $$0, float $$1, float $$2, float $$3) {
      return a($$0, axu.a(1.0F, $$1, $$2, $$3));
   }
}
