import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record iz(aks<dca> d, ir e) {
   public static final MapCodec<iz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dca.g.fieldOf("dimension").forGetter(iz::a), ir.a.fieldOf("pos").forGetter(iz::b)).apply($$0, iz::a)
   );
   public static final Codec<iz> b = a.codec();
   public static final zc<ByteBuf, iz> c = zc.a(aks.b(li.aS), iz::a, ir.b, iz::b, iz::a);

   public static iz a(aks<dca> $$0, ir $$1) {
      return new iz($$0, $$1);
   }

   @Override
   public String toString() {
      return this.d + " " + this.e;
   }

   public aks<dca> a() {
      return this.d;
   }

   public ir b() {
      return this.e;
   }
}
