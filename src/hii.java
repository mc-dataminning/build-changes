import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hii implements hio<dyu> {
   private final gth a;

   public hii(gth $$0) {
      this.a = $$0;
   }

   @Nullable
   public dyu a(czk $$0) {
      return $$0.a(kk.ao);
   }

   public void a(@Nullable dyu $$0, czi $$1, fjy $$2, gqm $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, Objects.requireNonNullElse($$0, dyu.a));
   }

   public static record a() implements hio.a {
      public static final MapCodec<hii.a> a = MapCodec.unit(new hii.a());

      @Override
      public MapCodec<hii.a> a() {
         return a;
      }

      @Override
      public hio<?> a(gjk $$0) {
         return new hii(new gth($$0));
      }
   }
}
