import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hea() implements hdw {
   public static final MapCodec<hea> a = MapCodec.unit(new hea());

   @Override
   public boolean a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3, cxw $$4) {
      if ($$2 instanceof cqi $$5 && $$5.ci != null) {
         bwk $$6 = gum.a($$5);
         return $$2.a($$6) == $$0;
      }

      return false;
   }

   @Override
   public MapCodec<hea> a() {
      return a;
   }
}
