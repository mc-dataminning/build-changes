import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hdz() implements hdw {
   public static final MapCodec<hdz> a = MapCodec.unit(new hdz());

   @Override
   public boolean a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3, cxw $$4) {
      return $$4 == cxw.g && fwf.t();
   }

   @Override
   public MapCodec<hdz> a() {
      return a;
   }
}
