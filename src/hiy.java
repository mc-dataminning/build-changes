import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hiy(int b) implements hjc {
   public static final MapCodec<hiy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayy.l.optionalFieldOf("index", 0).forGetter(hiy::b)).apply($$0, hiy::new));

   @Override
   public float a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3) {
      dcj $$4 = $$0.a(kl.p);
      if ($$4 != null) {
         Float $$5 = $$4.a(this.b);
         if ($$5 != null) {
            return $$5;
         }
      }

      return 0.0F;
   }

   @Override
   public MapCodec<hiy> a() {
      return a;
   }
}
