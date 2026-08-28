import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hdq implements hdw<dvg> {
   private final gos a;

   public hdq(gos $$0) {
      this.a = $$0;
   }

   @Nullable
   public dvg a(cwp $$0) {
      return $$0.a(kv.ak);
   }

   public void a(@Nullable dvg $$0, cwn $$1, ffu $$2, gly $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, Objects.requireNonNullElse($$0, dvg.a));
   }

   public static record a() implements hdw.a {
      public static final MapCodec<hdq.a> a = MapCodec.unit(new hdq.a());

      @Override
      public MapCodec<hdq.a> a() {
         return a;
      }

      @Override
      public hdw<?> a(gez $$0) {
         return new hdq(new gos($$0));
      }
   }
}
