import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ll(float c) implements lh {
   public static final MapCodec<ll> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.c)).apply($$0, ll::new));
   public static final ys<wf, ll> b = ys.a(yq.i, $$0 -> $$0.c, ll::new);

   @Override
   public li<ll> a() {
      return lj.J;
   }

   public float b() {
      return this.c;
   }
}
