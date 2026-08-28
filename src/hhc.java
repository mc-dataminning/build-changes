import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhc() implements hgt {
   public static final MapCodec<hhc> a = MapCodec.unit(new hhc());

   @Override
   public boolean get(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3, czl $$4) {
      return $$2 == null ? false : $$2.fy() && $$2.fA() == $$0;
   }

   @Override
   public MapCodec<hhc> a() {
      return a;
   }
}
