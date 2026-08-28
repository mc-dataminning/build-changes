import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record jp(alk<dff> d, jh e) {
   public static final MapCodec<jp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dff.h.fieldOf("dimension").forGetter(jp::a), jh.a.fieldOf("pos").forGetter(jp::b)).apply($$0, jp::a)
   );
   public static final Codec<jp> b = a.codec();
   public static final zj<ByteBuf, jp> c = zj.a(alk.b(ma.bb), jp::a, jh.b, jp::b, jp::a);

   public static jp a(alk<dff> $$0, jh $$1) {
      return new jp($$0, $$1);
   }

   @Override
   public String toString() {
      return this.d + " " + this.e;
   }

   public alk<dff> a() {
      return this.d;
   }

   public jh b() {
      return this.e;
   }
}
