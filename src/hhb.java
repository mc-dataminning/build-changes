import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhb() implements hgt {
   public static final MapCodec<hhb> a = MapCodec.unit(new hhb());

   @Override
   public boolean get(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3, czl $$4) {
      if ($$2 instanceof gpo $$5 && $$5.gi().g() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hhb> a() {
      return a;
   }
}
