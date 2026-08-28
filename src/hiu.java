import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hiu(boolean b) implements hja {
   public static final MapCodec<hiu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("normalize", true).forGetter(hiu::b)).apply($$0, hiu::new)
   );

   @Override
   public float a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3) {
      float $$4 = (float)$$0.M();
      float $$5 = (float)$$0.k();
      return this.b ? azo.a($$4 / $$5, 0.0F, 1.0F) : azo.a($$4, 0.0F, $$5);
   }

   @Override
   public MapCodec<hiu> a() {
      return a;
   }
}
