import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hgf(ki<?> b, boolean c) implements hga {
   public static final MapCodec<hgf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mf.am.q().fieldOf("component").forGetter(hgf::b), Codec.BOOL.optionalFieldOf("ignore_default", false).forGetter(hgf::c))
            .apply($$0, hgf::new)
   );

   @Override
   public boolean get(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3, czb $$4) {
      return this.c ? $$0.d(this.b) : $$0.c(this.b);
   }

   @Override
   public MapCodec<hgf> a() {
      return a;
   }
}
