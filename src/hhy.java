import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hhy(kk<?> b, boolean c) implements hht {
   public static final MapCodec<hhy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mh.am.q().fieldOf("component").forGetter(hhy::b), Codec.BOOL.optionalFieldOf("ignore_default", false).forGetter(hhy::c))
            .apply($$0, hhy::new)
   );

   @Override
   public boolean get(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3, dai $$4) {
      return this.c ? $$0.d(this.b) : $$0.c(this.b);
   }

   @Override
   public MapCodec<hhy> a() {
      return a;
   }
}
