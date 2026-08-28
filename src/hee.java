import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hee() implements hdw {
   public static final MapCodec<hee> a = MapCodec.unit(new hee());

   @Override
   public boolean a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3, cxw $$4) {
      if ($$2 instanceof gmw $$5 && $$5.gi().f() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hee> a() {
      return a;
   }
}
