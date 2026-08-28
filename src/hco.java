import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hco(int b) implements hcs {
   public static final MapCodec<hco> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.l.optionalFieldOf("index", 0).forGetter(hco::b)).apply($$0, hco::new));

   @Override
   public float a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      cyy $$4 = $$0.a(kv.p);
      if ($$4 != null) {
         Float $$5 = $$4.a(this.b);
         if ($$5 != null) {
            return $$5;
         }
      }

      return 0.0F;
   }

   @Override
   public MapCodec<hco> a() {
      return a;
   }
}
