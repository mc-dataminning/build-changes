import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hjy implements hke<dzk> {
   private final guw a;

   public hjy(guw $$0) {
      this.a = $$0;
   }

   @Nullable
   public dzk a(czy $$0) {
      return $$0.a(kk.ao);
   }

   public void a(@Nullable dzk $$0, czw $$1, flo $$2, gsa $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, Objects.requireNonNullElse($$0, dzk.a));
   }

   public static record a() implements hke.a {
      public static final MapCodec<hjy.a> a = MapCodec.unit(new hjy.a());

      @Override
      public MapCodec<hjy.a> a() {
         return a;
      }

      @Override
      public hke<?> a(gla $$0) {
         return new hjy(new guw($$0));
      }
   }
}
