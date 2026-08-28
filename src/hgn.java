import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgn() implements hgx {
   public static final MapCodec<hgn> a = MapCodec.unit(new hgn());

   @Override
   public float a(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3) {
      return cxs.c($$0);
   }

   @Override
   public MapCodec<hgn> a() {
      return a;
   }
}
