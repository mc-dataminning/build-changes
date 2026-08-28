import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hdp implements hdv<dvf> {
   private final gor a;

   public hdp(gor $$0) {
      this.a = $$0;
   }

   @Nullable
   public dvf a(cwo $$0) {
      return $$0.a(kv.ak);
   }

   public void a(@Nullable dvf $$0, cwm $$1, fft $$2, glx $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, Objects.requireNonNullElse($$0, dvf.a));
   }

   public static record a() implements hdv.a {
      public static final MapCodec<hdp.a> a = MapCodec.unit(new hdp.a());

      @Override
      public MapCodec<hdp.a> a() {
         return a;
      }

      @Override
      public hdv<?> a(gey $$0) {
         return new hdp(new gor($$0));
      }
   }
}
