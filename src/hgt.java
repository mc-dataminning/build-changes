import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hgt(int b) implements hgx {
   public static final MapCodec<hgt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.l.optionalFieldOf("index", 0).forGetter(hgt::b)).apply($$0, hgt::new));

   @Override
   public float a(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3) {
      dbm $$4 = $$0.a(kj.p);
      if ($$4 != null) {
         Float $$5 = $$4.a(this.b);
         if ($$5 != null) {
            return $$5;
         }
      }

      return 0.0F;
   }

   @Override
   public MapCodec<hgt> a() {
      return a;
   }
}
