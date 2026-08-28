import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hha(fpr b) implements hgt {
   private static final Codec<fpr> c = Codec.STRING.comapFlatMap($$0 -> {
      fpr $$1 = fpr.b($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Invalid keybind: " + $$0);
   }, fpr::h);
   public static final MapCodec<hha> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.fieldOf("keybind").forGetter(hha::b)).apply($$0, hha::new));

   @Override
   public boolean get(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3, czl $$4) {
      return this.b.e();
   }

   @Override
   public MapCodec<hha> a() {
      return a;
   }
}
