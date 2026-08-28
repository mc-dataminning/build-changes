import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hdd(fme b) implements hcw {
   private static final Codec<fme> c = Codec.STRING.comapFlatMap($$0 -> {
      fme $$1 = fme.b($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Invalid keybind: " + $$0);
   }, fme::h);
   public static final MapCodec<hdd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.fieldOf("keybind").forGetter(hdd::b)).apply($$0, hdd::new));

   @Override
   public boolean a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3, cxf $$4) {
      return this.b.e();
   }

   @Override
   public MapCodec<hdd> a() {
      return a;
   }
}
