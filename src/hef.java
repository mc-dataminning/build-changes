import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hef() implements hdw {
   public static final MapCodec<hef> a = MapCodec.unit(new hef());

   @Override
   public boolean a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3, cxw $$4) {
      return $$2 == null ? false : $$2.fy() && $$2.fA() == $$0;
   }

   @Override
   public MapCodec<hef> a() {
      return a;
   }
}
