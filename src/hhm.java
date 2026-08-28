import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hhm(int b) implements hhq {
   public static final MapCodec<hhm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.l.optionalFieldOf("index", 0).forGetter(hhm::b)).apply($$0, hhm::new));

   @Override
   public float a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3) {
      dbw $$4 = $$0.a(kk.p);
      if ($$4 != null) {
         Float $$5 = $$4.a(this.b);
         if ($$5 != null) {
            return $$5;
         }
      }

      return 0.0F;
   }

   @Override
   public MapCodec<hhm> a() {
      return a;
   }
}
