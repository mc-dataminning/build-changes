import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hhn implements hht<dyf> {
   private final gsn a;

   public hhn(gsn $$0) {
      this.a = $$0;
   }

   @Nullable
   public dyf a(cyy $$0) {
      return $$0.a(kj.ao);
   }

   public void a(@Nullable dyf $$0, cyw $$1, fjc $$2, gps $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, Objects.requireNonNullElse($$0, dyf.a));
   }

   public static record a() implements hht.a {
      public static final MapCodec<hhn.a> a = MapCodec.unit(new hhn.a());

      @Override
      public MapCodec<hhn.a> a() {
         return a;
      }

      @Override
      public hht<?> a(giq $$0) {
         return new hhn(new gsn($$0));
      }
   }
}
