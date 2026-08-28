import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hfm() implements hfc {
   public static final MapCodec<hfm> a = MapCodec.unit(new hfm());

   @Override
   public boolean get(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3, cyq $$4) {
      fof $$5 = fof.Q();
      bwa $$6 = $$5.ao();
      return $$6 != null ? $$2 == $$6 : $$2 == $$5.t;
   }

   @Override
   public MapCodec<hfm> a() {
      return a;
   }
}
