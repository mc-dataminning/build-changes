import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hka implements hkg<dzm> {
   private final guy a;

   public hka(guy $$0) {
      this.a = $$0;
   }

   @Nullable
   public dzm a(daa $$0) {
      return $$0.a(kl.ao);
   }

   public void a(@Nullable dzm $$0, czy $$1, flq $$2, gsc $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, Objects.requireNonNullElse($$0, dzm.a));
   }

   public static record a() implements hkg.a {
      public static final MapCodec<hka.a> a = MapCodec.unit(new hka.a());

      @Override
      public MapCodec<hka.a> a() {
         return a;
      }

      @Override
      public hkg<?> a(glc $$0) {
         return new hka(new guy($$0));
      }
   }
}
