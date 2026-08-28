import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hgu(fpm b) implements hgn {
   private static final Codec<fpm> c = Codec.STRING.comapFlatMap($$0 -> {
      fpm $$1 = fpm.b($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Invalid keybind: " + $$0);
   }, fpm::h);
   public static final MapCodec<hgu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.fieldOf("keybind").forGetter(hgu::b)).apply($$0, hgu::new));

   @Override
   public boolean get(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3, czi $$4) {
      return this.b.e();
   }

   @Override
   public MapCodec<hgu> a() {
      return a;
   }
}
