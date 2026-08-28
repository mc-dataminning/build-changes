import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hdt() implements hdw {
   public static final MapCodec<hdt> a = MapCodec.unit(new hdt());

   @Override
   public boolean a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3, cxw $$4) {
      return $$0.r();
   }

   @Override
   public MapCodec<hdt> a() {
      return a;
   }
}
