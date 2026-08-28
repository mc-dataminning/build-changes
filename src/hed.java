import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hed(fnb b) implements hdw {
   private static final Codec<fnb> c = Codec.STRING.comapFlatMap($$0 -> {
      fnb $$1 = fnb.b($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Invalid keybind: " + $$0);
   }, fnb::h);
   public static final MapCodec<hed> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.fieldOf("keybind").forGetter(hed::b)).apply($$0, hed::new));

   @Override
   public boolean a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3, cxw $$4) {
      return this.b.e();
   }

   @Override
   public MapCodec<hed> a() {
      return a;
   }
}
