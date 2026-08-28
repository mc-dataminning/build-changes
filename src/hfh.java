import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hfh(ki<?> b, boolean c) implements hfc {
   public static final MapCodec<hfh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mf.am.q().fieldOf("component").forGetter(hfh::b), Codec.BOOL.optionalFieldOf("ignore_default", false).forGetter(hfh::c))
            .apply($$0, hfh::new)
   );

   @Override
   public boolean get(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3, cyq $$4) {
      return this.c ? $$0.d(this.b) : $$0.c(this.b);
   }

   @Override
   public MapCodec<hfh> a() {
      return a;
   }
}
