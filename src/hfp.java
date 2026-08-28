import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hfp() implements hfz {
   public static final MapCodec<hfp> a = MapCodec.unit(new hfp());

   @Override
   public float a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3) {
      return cxh.c($$0);
   }

   @Override
   public MapCodec<hfp> a() {
      return a;
   }
}
