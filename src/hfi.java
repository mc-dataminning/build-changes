import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hfi() implements hfc {
   public static final MapCodec<hfi> a = MapCodec.unit(new hfi());

   @Override
   public boolean get(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3, cyq $$4) {
      if ($$2 instanceof goa $$5 && $$5.bQ.g() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hfi> a() {
      return a;
   }
}
