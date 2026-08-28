import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcg() implements hbw {
   public static final MapCodec<hcg> a = MapCodec.unit(new hcg());

   @Override
   public boolean a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3, cwm $$4) {
      fli $$5 = fli.Q();
      buk $$6 = $$5.ao();
      return $$6 != null ? $$2 == $$6 : $$2 == $$5.t;
   }

   @Override
   public MapCodec<hcg> a() {
      return a;
   }
}
