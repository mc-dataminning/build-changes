import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record jm(ala<dds> d, je e) {
   public static final MapCodec<jm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dds.g.fieldOf("dimension").forGetter(jm::a), je.a.fieldOf("pos").forGetter(jm::b)).apply($$0, jm::a)
   );
   public static final Codec<jm> b = a.codec();
   public static final zb<ByteBuf, jm> c = zb.a(ala.b(lv.ba), jm::a, je.b, jm::b, jm::a);

   public static jm a(ala<dds> $$0, je $$1) {
      return new jm($$0, $$1);
   }

   @Override
   public String toString() {
      return this.d + " " + this.e;
   }

   public ala<dds> a() {
      return this.d;
   }

   public je b() {
      return this.e;
   }
}
