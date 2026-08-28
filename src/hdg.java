import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hdg() implements hdi<bvb> {
   public static final hdi.a<hdg, bvb> a = hdi.a.a(MapCodec.unit(new hdg()), bvb.c);

   @Nullable
   public bvb a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2, int $$3, cwn $$4) {
      return $$2 == null ? null : $$2.fy();
   }

   @Override
   public hdi.a<hdg, bvb> a() {
      return a;
   }
}
