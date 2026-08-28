import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record jo(alg<dev> d, jg e) {
   public static final MapCodec<jo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dev.h.fieldOf("dimension").forGetter(jo::a), jg.a.fieldOf("pos").forGetter(jo::b)).apply($$0, jo::a)
   );
   public static final Codec<jo> b = a.codec();
   public static final zf<ByteBuf, jo> c = zf.a(alg.b(ly.bb), jo::a, jg.b, jo::b, jo::a);

   public static jo a(alg<dev> $$0, jg $$1) {
      return new jo($$0, $$1);
   }

   @Override
   public String toString() {
      return this.d + " " + this.e;
   }

   public alg<dev> a() {
      return this.d;
   }

   public jg b() {
      return this.e;
   }
}
