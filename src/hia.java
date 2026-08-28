import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hia(fqo b) implements hht {
   private static final Codec<fqo> c = Codec.STRING.comapFlatMap($$0 -> {
      fqo $$1 = fqo.b($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Invalid keybind: " + $$0);
   }, fqo::h);
   public static final MapCodec<hia> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.fieldOf("keybind").forGetter(hia::b)).apply($$0, hia::new));

   @Override
   public boolean get(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3, dai $$4) {
      return this.b.e();
   }

   @Override
   public MapCodec<hia> a() {
      return a;
   }
}
