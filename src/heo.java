import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record heo(int b) implements hes {
   public static final MapCodec<heo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.l.optionalFieldOf("index", 0).forGetter(heo::b)).apply($$0, heo::new));

   @Override
   public float a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3) {
      daf $$4 = $$0.a(kx.p);
      if ($$4 != null) {
         Float $$5 = $$4.a(this.b);
         if ($$5 != null) {
            return $$5;
         }
      }

      return 0.0F;
   }

   @Override
   public MapCodec<heo> a() {
      return a;
   }
}
