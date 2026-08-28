import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record heg() implements hdw {
   public static final MapCodec<heg> a = MapCodec.unit(new heg());

   @Override
   public boolean a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3, cxw $$4) {
      fnd $$5 = fnd.Q();
      bvs $$6 = $$5.ao();
      return $$6 != null ? $$2 == $$6 : $$2 == $$5.t;
   }

   @Override
   public MapCodec<heg> a() {
      return a;
   }
}
