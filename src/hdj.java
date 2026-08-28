import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hdj implements hdo<dvg> {
   private final goq a;

   public hdj(goq $$0) {
      this.a = $$0;
   }

   @Nullable
   public dvg a(cwp $$0) {
      return $$0.a(kv.ak);
   }

   public void a(@Nullable dvg $$0, cwn $$1, ffu $$2, glx $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, Objects.requireNonNullElse($$0, dvg.a));
   }

   public static record a() implements hdo.a {
      public static final MapCodec<hdj.a> a = MapCodec.unit(new hdj.a());

      @Override
      public MapCodec<hdj.a> a() {
         return a;
      }

      @Override
      public hdo<?> a(gey $$0) {
         return new hdj(new goq($$0));
      }
   }
}
