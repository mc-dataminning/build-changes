import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hik(kk<?> b, boolean c) implements hif {
   public static final MapCodec<hik> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mh.am.q().fieldOf("component").forGetter(hik::b), Codec.BOOL.optionalFieldOf("ignore_default", false).forGetter(hik::c))
            .apply($$0, hik::new)
   );

   @Override
   public boolean get(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3, czy $$4) {
      return this.c ? $$0.d(this.b) : $$0.c(this.b);
   }

   @Override
   public MapCodec<hik> a() {
      return a;
   }
}
