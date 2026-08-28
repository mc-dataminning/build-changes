import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcc() implements hby {
   public static final MapCodec<hcc> a = MapCodec.unit(new hcc());

   @Override
   public boolean a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2, int $$3, cwo $$4) {
      if ($$2 instanceof coy $$5 && $$5.cw != null) {
         bvc $$6 = gsm.a($$5);
         return $$2.a($$6) == $$0;
      }

      return false;
   }

   @Override
   public MapCodec<hcc> a() {
      return a;
   }
}
