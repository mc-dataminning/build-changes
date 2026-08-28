import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hgx implements hhd<dxv> {
   private final gry a;

   public hgx(gry $$0) {
      this.a = $$0;
   }

   @Nullable
   public dxv a(cys $$0) {
      return $$0.a(kj.ao);
   }

   public void a(@Nullable dxv $$0, cyq $$1, fiq $$2, gpd $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, Objects.requireNonNullElse($$0, dxv.a));
   }

   public static record a() implements hhd.a {
      public static final MapCodec<hgx.a> a = MapCodec.unit(new hgx.a());

      @Override
      public MapCodec<hgx.a> a() {
         return a;
      }

      @Override
      public hhd<?> a(gic $$0) {
         return new hgx(new gry($$0));
      }
   }
}
