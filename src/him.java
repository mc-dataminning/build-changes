import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record him(frd b) implements hif {
   private static final Codec<frd> c = Codec.STRING.comapFlatMap($$0 -> {
      frd $$1 = frd.b($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Invalid keybind: " + $$0);
   }, frd::h);
   public static final MapCodec<him> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.fieldOf("keybind").forGetter(him::b)).apply($$0, him::new));

   @Override
   public boolean get(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3, czy $$4) {
      return this.b.e();
   }

   @Override
   public MapCodec<him> a() {
      return a;
   }
}
