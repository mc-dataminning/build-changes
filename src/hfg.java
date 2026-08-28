import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hfg() implements hfi<bwk> {
   public static final hfi.a<hfg, bwk> a = hfi.a.a(MapCodec.unit(new hfg()), bwk.c);

   @Nullable
   public bwk a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3, cxw $$4) {
      return $$2 == null ? null : $$2.fx();
   }

   @Override
   public hfi.a<hfg, bwk> a() {
      return a;
   }
}
