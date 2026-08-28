import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;

public record jy(float c, float d, float e) {
   public static final Codec<jy> a = Codec.FLOAT
      .listOf()
      .comapFlatMap(
         $$0 -> ag.a($$0, 3).map($$0x -> new jy((Float)$$0x.get(0), (Float)$$0x.get(1), (Float)$$0x.get(2))), $$0 -> List.of($$0.a(), $$0.b(), $$0.c())
      );
   public static final ze<ByteBuf, jy> b = new ze<ByteBuf, jy>() {
      public jy a(ByteBuf $$0) {
         return new jy($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
      }

      public void a(ByteBuf $$0, jy $$1) {
         $$0.writeFloat($$1.c);
         $$0.writeFloat($$1.d);
         $$0.writeFloat($$1.e);
      }
   };

   public jy(float c, float d, float e) {
      c = !Float.isInfinite(c) && !Float.isNaN(c) ? c % 360.0F : 0.0F;
      d = !Float.isInfinite(d) && !Float.isNaN(d) ? d % 360.0F : 0.0F;
      e = !Float.isInfinite(e) && !Float.isNaN(e) ? e % 360.0F : 0.0F;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   public float a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }
}
