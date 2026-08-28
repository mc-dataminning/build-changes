import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record jh(ale<dbz> d, iz e) {
   public static final MapCodec<jh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dbz.g.fieldOf("dimension").forGetter(jh::a), iz.a.fieldOf("pos").forGetter(jh::b)).apply($$0, jh::a)
   );
   public static final Codec<jh> b = a.codec();
   public static final zn<ByteBuf, jh> c = zn.a(ale.b(lq.aS), jh::a, iz.b, jh::b, jh::a);

   public static jh a(ale<dbz> $$0, iz $$1) {
      return new jh($$0, $$1);
   }

   @Override
   public String toString() {
      return this.d + " " + this.e;
   }

   public ale<dbz> a() {
      return this.d;
   }

   public iz b() {
      return this.e;
   }
}
