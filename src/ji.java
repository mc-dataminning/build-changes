import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record ji(akj<dcg> d, ja e) {
   public static final MapCodec<ji> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcg.g.fieldOf("dimension").forGetter(ji::a), ja.a.fieldOf("pos").forGetter(ji::b)).apply($$0, ji::a)
   );
   public static final Codec<ji> b = a.codec();
   public static final ys<ByteBuf, ji> c = ys.a(akj.b(lr.aZ), ji::a, ja.b, ji::b, ji::a);

   public static ji a(akj<dcg> $$0, ja $$1) {
      return new ji($$0, $$1);
   }

   @Override
   public String toString() {
      return this.d + " " + this.e;
   }

   public akj<dcg> a() {
      return this.d;
   }

   public ja b() {
      return this.e;
   }
}
