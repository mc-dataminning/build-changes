import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hcm(boolean b) implements hcs {
   public static final MapCodec<hcm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("normalize", true).forGetter(hcm::b)).apply($$0, hcm::new)
   );

   @Override
   public float a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      float $$4 = (float)$$0.M();
      float $$5 = (float)$$0.k();
      return this.b ? ayz.a($$4 / $$5, 0.0F, 1.0F) : ayz.a($$4, 0.0F, $$5);
   }

   @Override
   public MapCodec<hcm> a() {
      return a;
   }
}
