import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record lt(float c) implements lp {
   public static final MapCodec<lt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.c)).apply($$0, lt::new));
   public static final zg<wt, lt> b = zg.a(ze.j, $$0 -> $$0.c, lt::new);

   @Override
   public lq<lt> a() {
      return lr.J;
   }

   public float b() {
      return this.c;
   }
}
