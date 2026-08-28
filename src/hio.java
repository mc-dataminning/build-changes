import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hio implements hiu<dyz> {
   private final gtm a;

   public hio(gtm $$0) {
      this.a = $$0;
   }

   @Nullable
   public dyz a(czn $$0) {
      return $$0.a(kk.ao);
   }

   public void a(@Nullable dyz $$0, czl $$1, fkd $$2, gqr $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, Objects.requireNonNullElse($$0, dyz.a));
   }

   public static record a() implements hiu.a {
      public static final MapCodec<hio.a> a = MapCodec.unit(new hio.a());

      @Override
      public MapCodec<hio.a> a() {
         return a;
      }

      @Override
      public hiu<?> a(gjp $$0) {
         return new hio(new gtm($$0));
      }
   }
}
