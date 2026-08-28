import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hca(flf b) implements hbt {
   private static final Codec<flf> c = Codec.STRING.comapFlatMap($$0 -> {
      flf $$1 = flf.b($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Invalid keybind: " + $$0);
   }, flf::h);
   public static final MapCodec<hca> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.fieldOf("keybind").forGetter(hca::b)).apply($$0, hca::new));

   @Override
   public boolean a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3, cwl $$4) {
      return this.b.e();
   }

   @Override
   public MapCodec<hca> a() {
      return a;
   }
}
