import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hgs(kj<?> b, boolean c) implements hgn {
   public static final MapCodec<hgs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mg.am.q().fieldOf("component").forGetter(hgs::b), Codec.BOOL.optionalFieldOf("ignore_default", false).forGetter(hgs::c))
            .apply($$0, hgs::new)
   );

   @Override
   public boolean get(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3, czi $$4) {
      return this.c ? $$0.d(this.b) : $$0.c(this.b);
   }

   @Override
   public MapCodec<hgs> a() {
      return a;
   }
}
