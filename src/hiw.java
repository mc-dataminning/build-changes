import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hiw(int b) implements hja {
   public static final MapCodec<hiw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayw.l.optionalFieldOf("index", 0).forGetter(hiw::b)).apply($$0, hiw::new));

   @Override
   public float a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3) {
      dch $$4 = $$0.a(kk.p);
      if ($$4 != null) {
         Float $$5 = $$4.a(this.b);
         if ($$5 != null) {
            return $$5;
         }
      }

      return 0.0F;
   }

   @Override
   public MapCodec<hiw> a() {
      return a;
   }
}
