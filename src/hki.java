import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class hki implements hkc {
   private final giy a;
   private final hnj b;

   public hki(giy $$0, hnj $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(czy $$0, flq $$1, gsc $$2, int $$3, int $$4, boolean $$5) {
      gve.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(ecu b, Optional<alk> c) implements hkg.a {
      public static final MapCodec<hki.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ecu.a.fieldOf("wood_type").forGetter(hki.a::b), alk.a.optionalFieldOf("texture").forGetter(hki.a::c)).apply($$0, hki.a::new)
      );

      public a(ecu $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hki.a> a() {
         return a;
      }

      @Override
      public hkg<?> a(glc $$0) {
         giy $$1 = gve.a($$0, this.b, true);
         hnj $$2 = this.c.<hnj>map(gsw.q::a).orElseGet(() -> gsw.a(this.b));
         return new hki($$1, $$2);
      }
   }
}
