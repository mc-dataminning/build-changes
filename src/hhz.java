import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhz() implements hht {
   public static final MapCodec<hhz> a = MapCodec.unit(new hhz());

   @Override
   public boolean get(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3, dai $$4) {
      if ($$2 instanceof gqm $$5 && $$5.bR.g() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hhz> a() {
      return a;
   }
}
