import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhd() implements hgt {
   public static final MapCodec<hhd> a = MapCodec.unit(new hhd());

   @Override
   public boolean get(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3, czl $$4) {
      fpt $$5 = fpt.Q();
      bwi $$6 = $$5.ao();
      return $$6 != null ? $$2 == $$6 : $$2 == $$5.t;
   }

   @Override
   public MapCodec<hhd> a() {
      return a;
   }
}
