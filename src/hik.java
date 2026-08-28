import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hik(frb b) implements hid {
   private static final Codec<frb> c = Codec.STRING.comapFlatMap($$0 -> {
      frb $$1 = frb.b($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Invalid keybind: " + $$0);
   }, frb::h);
   public static final MapCodec<hik> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.fieldOf("keybind").forGetter(hik::b)).apply($$0, hik::new));

   @Override
   public boolean get(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3, czw $$4) {
      return this.b.e();
   }

   @Override
   public MapCodec<hik> a() {
      return a;
   }
}
