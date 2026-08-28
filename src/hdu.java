import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hdu() implements hdw {
   public static final MapCodec<hdu> a = MapCodec.unit(new hdu());

   @Override
   public boolean a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3, cxw $$4) {
      return cwm.g($$0);
   }

   @Override
   public MapCodec<hdu> a() {
      return a;
   }
}
