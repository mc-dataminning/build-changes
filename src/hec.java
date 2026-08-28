import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hec() implements hdw {
   public static final MapCodec<hec> a = MapCodec.unit(new hec());

   @Override
   public boolean a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3, cxw $$4) {
      if ($$2 instanceof gmw $$5 && $$5.bP.g() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hec> a() {
      return a;
   }
}
