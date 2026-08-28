import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hbz() implements hbt {
   public static final MapCodec<hbz> a = MapCodec.unit(new hbz());

   @Override
   public boolean a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3, cwl $$4) {
      if ($$2 instanceof gkt $$5 && $$5.cd.g() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hbz> a() {
      return a;
   }
}
