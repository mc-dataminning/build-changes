import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record ik(ajs<cyx> d, ib e) {
   public static final MapCodec<ik> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cyx.g.fieldOf("dimension").forGetter(ik::a), ib.a.fieldOf("pos").forGetter(ik::b)).apply($$0, ik::a)
   );
   public static final Codec<ik> b = a.codec();
   public static final ye<ByteBuf, ik> c = ye.a(ajs.b(ks.aO), ik::a, ib.b, ik::b, ik::a);

   public static ik a(ajs<cyx> $$0, ib $$1) {
      return new ik($$0, $$1);
   }

   @Override
   public String toString() {
      return this.d + " " + this.e;
   }

   public ajs<cyx> a() {
      return this.d;
   }

   public ib b() {
      return this.e;
   }
}
