import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hcd(flg b) implements hbw {
   private static final Codec<flg> c = Codec.STRING.comapFlatMap($$0 -> {
      flg $$1 = flg.b($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Invalid keybind: " + $$0);
   }, flg::h);
   public static final MapCodec<hcd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.fieldOf("keybind").forGetter(hcd::b)).apply($$0, hcd::new));

   @Override
   public boolean a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3, cwm $$4) {
      return this.b.e();
   }

   @Override
   public MapCodec<hcd> a() {
      return a;
   }
}
