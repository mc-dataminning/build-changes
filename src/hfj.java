import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hfj(fod b) implements hfc {
   private static final Codec<fod> c = Codec.STRING.comapFlatMap($$0 -> {
      fod $$1 = fod.b($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Invalid keybind: " + $$0);
   }, fod::h);
   public static final MapCodec<hfj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.fieldOf("keybind").forGetter(hfj::b)).apply($$0, hfj::new));

   @Override
   public boolean get(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3, cyq $$4) {
      return this.b.e();
   }

   @Override
   public MapCodec<hfj> a() {
      return a;
   }
}
