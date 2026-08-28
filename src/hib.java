import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hib() implements hht {
   public static final MapCodec<hib> a = MapCodec.unit(new hib());

   @Override
   public boolean get(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3, dai $$4) {
      if ($$2 instanceof gqm $$5 && $$5.gj().g() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hib> a() {
      return a;
   }
}
