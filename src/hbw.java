import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hbw() implements hbt {
   public static final MapCodec<hbw> a = MapCodec.unit(new hbw());

   @Override
   public boolean a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3, cwl $$4) {
      return $$4 == cwl.g && fui.t();
   }

   @Override
   public MapCodec<hbw> a() {
      return a;
   }
}
