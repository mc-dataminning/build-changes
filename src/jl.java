import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record jl(akp<dcu> d, jd e) {
   public static final MapCodec<jl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcu.g.fieldOf("dimension").forGetter(jl::a), jd.a.fieldOf("pos").forGetter(jl::b)).apply($$0, jl::a)
   );
   public static final Codec<jl> b = a.codec();
   public static final yw<ByteBuf, jl> c = yw.a(akp.b(lu.ba), jl::a, jd.b, jl::b, jl::a);

   public static jl a(akp<dcu> $$0, jd $$1) {
      return new jl($$0, $$1);
   }

   @Override
   public String toString() {
      return this.d + " " + this.e;
   }

   public akp<dcu> a() {
      return this.d;
   }

   public jd b() {
      return this.e;
   }
}
