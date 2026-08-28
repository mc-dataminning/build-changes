import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hin() implements hif {
   public static final MapCodec<hin> a = MapCodec.unit(new hin());

   @Override
   public boolean get(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3, czy $$4) {
      if ($$2 instanceof grb $$5 && $$5.gj().g() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hin> a() {
      return a;
   }
}
