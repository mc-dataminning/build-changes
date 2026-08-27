import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record iv(akg<dad> d, in e) {
   public static final MapCodec<iv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dad.g.fieldOf("dimension").forGetter(iv::a), in.a.fieldOf("pos").forGetter(iv::b)).apply($$0, iv::a)
   );
   public static final Codec<iv> b = a.codec();
   public static final ys<ByteBuf, iv> c = ys.a(akg.b(le.aS), iv::a, in.b, iv::b, iv::a);

   public static iv a(akg<dad> $$0, in $$1) {
      return new iv($$0, $$1);
   }

   @Override
   public String toString() {
      return this.d + " " + this.e;
   }

   public akg<dad> a() {
      return this.d;
   }

   public in b() {
      return this.e;
   }
}
