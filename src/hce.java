import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hce(flh b) implements hbx {
   private static final Codec<flh> c = Codec.STRING.comapFlatMap($$0 -> {
      flh $$1 = flh.b($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Invalid keybind: " + $$0);
   }, flh::h);
   public static final MapCodec<hce> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.fieldOf("keybind").forGetter(hce::b)).apply($$0, hce::new));

   @Override
   public boolean a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2, int $$3, cwn $$4) {
      return this.b.e();
   }

   @Override
   public MapCodec<hce> a() {
      return a;
   }
}
