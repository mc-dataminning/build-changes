import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hii(kj<?> b, boolean c) implements hid {
   public static final MapCodec<hii> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mg.am.q().fieldOf("component").forGetter(hii::b), Codec.BOOL.optionalFieldOf("ignore_default", false).forGetter(hii::c))
            .apply($$0, hii::new)
   );

   @Override
   public boolean get(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3, czw $$4) {
      return this.c ? $$0.d(this.b) : $$0.c(this.b);
   }

   @Override
   public MapCodec<hii> a() {
      return a;
   }
}
