import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hjo implements hju<dzw> {
   private final guj a;

   public hjo(guj $$0) {
      this.a = $$0;
   }

   @Nullable
   public dzw a(dak $$0) {
      return $$0.a(kl.ao);
   }

   public void a(@Nullable dzw $$0, dai $$1, fld $$2, grn $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, Objects.requireNonNullElse($$0, dzw.a));
   }

   public static record a() implements hju.a {
      public static final MapCodec<hjo.a> a = MapCodec.unit(new hjo.a());

      @Override
      public MapCodec<hjo.a> a() {
         return a;
      }

      @Override
      public hju<?> a(gkn $$0) {
         return new hjo(new guj($$0));
      }
   }
}
