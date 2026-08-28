import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hcf(fli b) implements hby {
   private static final Codec<fli> c = Codec.STRING.comapFlatMap($$0 -> {
      fli $$1 = fli.b($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Invalid keybind: " + $$0);
   }, fli::h);
   public static final MapCodec<hcf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.fieldOf("keybind").forGetter(hcf::b)).apply($$0, hcf::new));

   @Override
   public boolean a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2, int $$3, cwo $$4) {
      return this.b.e();
   }

   @Override
   public MapCodec<hcf> a() {
      return a;
   }
}
