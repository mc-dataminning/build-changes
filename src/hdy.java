import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hdy() implements hdw {
   public static final MapCodec<hdy> a = MapCodec.unit(new hdy());

   @Override
   public boolean a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3, cxw $$4) {
      return $$0.n();
   }

   @Override
   public MapCodec<hdy> a() {
      return a;
   }
}
