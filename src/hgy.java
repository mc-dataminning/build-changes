import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hgy(kj<?> b, boolean c) implements hgt {
   public static final MapCodec<hgy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mg.am.q().fieldOf("component").forGetter(hgy::b), Codec.BOOL.optionalFieldOf("ignore_default", false).forGetter(hgy::c))
            .apply($$0, hgy::new)
   );

   @Override
   public boolean get(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3, czl $$4) {
      return this.c ? $$0.d(this.b) : $$0.c(this.b);
   }

   @Override
   public MapCodec<hgy> a() {
      return a;
   }
}
