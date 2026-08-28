import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record jm(alb<deg> d, je e) {
   public static final MapCodec<jm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(deg.g.fieldOf("dimension").forGetter(jm::a), je.a.fieldOf("pos").forGetter(jm::b)).apply($$0, jm::a)
   );
   public static final Codec<jm> b = a.codec();
   public static final zb<ByteBuf, jm> c = zb.a(alb.b(lv.bb), jm::a, je.b, jm::b, jm::a);

   public static jm a(alb<deg> $$0, je $$1) {
      return new jm($$0, $$1);
   }

   @Override
   public String toString() {
      return this.d + " " + this.e;
   }

   public alb<deg> a() {
      return this.d;
   }

   public je b() {
      return this.e;
   }
}
