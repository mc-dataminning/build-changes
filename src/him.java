import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record him(int b) implements hiq {
   public static final MapCodec<him> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azg.l.optionalFieldOf("index", 0).forGetter(him::b)).apply($$0, him::new));

   @Override
   public float a(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3) {
      dct $$4 = $$0.a(kl.p);
      if ($$4 != null) {
         Float $$5 = $$4.a(this.b);
         if ($$5 != null) {
            return $$5;
         }
      }

      return 0.0F;
   }

   @Override
   public MapCodec<him> a() {
      return a;
   }
}
