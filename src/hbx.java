import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hbx() implements hbt {
   public static final MapCodec<hbx> a = MapCodec.unit(new hbx());

   @Override
   public boolean a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3, cwl $$4) {
      if ($$2 instanceof cov $$5 && $$5.cw != null) {
         buz $$6 = gsi.a($$5);
         return $$2.a($$6) == $$0;
      }

      return false;
   }

   @Override
   public MapCodec<hbx> a() {
      return a;
   }
}
