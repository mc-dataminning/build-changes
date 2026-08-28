import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class hiq implements hik {
   private final ghg a;
   private final hlq b;

   public hiq(ghg $$0, hlq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(czi $$0, fjy $$1, gqm $$2, int $$3, int $$4, boolean $$5) {
      gtn.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(ecc b, Optional<alg> c) implements hio.a {
      public static final MapCodec<hiq.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ecc.a.fieldOf("wood_type").forGetter(hiq.a::b), alg.a.optionalFieldOf("texture").forGetter(hiq.a::c)).apply($$0, hiq.a::new)
      );

      public a(ecc $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hiq.a> a() {
         return a;
      }

      @Override
      public hio<?> a(gjk $$0) {
         ghg $$1 = gtn.a($$0, this.b, true);
         hlq $$2 = this.c.<hlq>map(grg.q::a).orElseGet(() -> grg.a(this.b));
         return new hiq($$1, $$2);
      }
   }
}
