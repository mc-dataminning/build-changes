import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgi() implements hga {
   public static final MapCodec<hgi> a = MapCodec.unit(new hgi());

   @Override
   public boolean get(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3, czb $$4) {
      if ($$2 instanceof gox $$5 && $$5.gj().g() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hgi> a() {
      return a;
   }
}
