import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hfg() implements hfc {
   public static final MapCodec<hfg> a = MapCodec.unit(new hfg());

   @Override
   public boolean get(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3, cyq $$4) {
      if ($$2 instanceof cqs $$5 && $$5.cj != null) {
         bws $$6 = gvr.a($$5);
         return $$2.a($$6) == $$0;
      }

      return false;
   }

   @Override
   public MapCodec<hfg> a() {
      return a;
   }
}
