import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hfk() implements hfc {
   public static final MapCodec<hfk> a = MapCodec.unit(new hfk());

   @Override
   public boolean get(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3, cyq $$4) {
      if ($$2 instanceof goa $$5 && $$5.gi().f() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hfk> a() {
      return a;
   }
}
