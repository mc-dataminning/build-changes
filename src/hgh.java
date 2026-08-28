import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hgh(fox b) implements hga {
   private static final Codec<fox> c = Codec.STRING.comapFlatMap($$0 -> {
      fox $$1 = fox.b($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Invalid keybind: " + $$0);
   }, fox::h);
   public static final MapCodec<hgh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.fieldOf("keybind").forGetter(hgh::b)).apply($$0, hgh::new));

   @Override
   public boolean get(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3, czb $$4) {
      return this.b.e();
   }

   @Override
   public MapCodec<hgh> a() {
      return a;
   }
}
