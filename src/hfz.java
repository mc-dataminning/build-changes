import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hfz(fop b) implements hfs {
   private static final Codec<fop> c = Codec.STRING.comapFlatMap($$0 -> {
      fop $$1 = fop.b($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Invalid keybind: " + $$0);
   }, fop::h);
   public static final MapCodec<hfz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.fieldOf("keybind").forGetter(hfz::b)).apply($$0, hfz::new));

   @Override
   public boolean get(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3, cyw $$4) {
      return this.b.e();
   }

   @Override
   public MapCodec<hfz> a() {
      return a;
   }
}
