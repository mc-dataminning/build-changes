import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record iu(ake<czu> d, im e) {
   public static final MapCodec<iu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(czu.g.fieldOf("dimension").forGetter(iu::a), im.a.fieldOf("pos").forGetter(iu::b)).apply($$0, iu::a)
   );
   public static final Codec<iu> b = a.codec();
   public static final yq<ByteBuf, iu> c = yq.a(ake.b(ld.aR), iu::a, im.b, iu::b, iu::a);

   public static iu a(ake<czu> $$0, im $$1) {
      return new iu($$0, $$1);
   }

   @Override
   public String toString() {
      return this.d + " " + this.e;
   }

   public ake<czu> a() {
      return this.d;
   }

   public im b() {
      return this.e;
   }
}
