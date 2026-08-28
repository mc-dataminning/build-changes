import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record jn(ald<dej> d, jf e) {
   public static final MapCodec<jn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dej.g.fieldOf("dimension").forGetter(jn::a), jf.a.fieldOf("pos").forGetter(jn::b)).apply($$0, jn::a)
   );
   public static final Codec<jn> b = a.codec();
   public static final zc<ByteBuf, jn> c = zc.a(ald.b(lw.bc), jn::a, jf.b, jn::b, jn::a);

   public static jn a(ald<dej> $$0, jf $$1) {
      return new jn($$0, $$1);
   }

   @Override
   public String toString() {
      return this.d + " " + this.e;
   }

   public ald<dej> a() {
      return this.d;
   }

   public jf b() {
      return this.e;
   }
}
