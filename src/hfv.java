import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hfv(int b) implements hfz {
   public static final MapCodec<hfv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.l.optionalFieldOf("index", 0).forGetter(hfv::b)).apply($$0, hfv::new));

   @Override
   public float a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3) {
      dbb $$4 = $$0.a(kj.p);
      if ($$4 != null) {
         Float $$5 = $$4.a(this.b);
         if ($$5 != null) {
            return $$5;
         }
      }

      return 0.0F;
   }

   @Override
   public MapCodec<hfv> a() {
      return a;
   }
}
