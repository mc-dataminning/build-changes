import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgv() implements hgn {
   public static final MapCodec<hgv> a = MapCodec.unit(new hgv());

   @Override
   public boolean get(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3, czi $$4) {
      if ($$2 instanceof gpj $$5 && $$5.gi().g() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hgv> a() {
      return a;
   }
}
