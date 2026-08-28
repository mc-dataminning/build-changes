import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class hij implements hik {
   private final ghg a;
   private final hlq b;

   public hij(ghg $$0, hlq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(czi $$0, fjy $$1, gqm $$2, int $$3, int $$4, boolean $$5) {
      gtj.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(ecc b, Optional<alg> c) implements hio.a {
      public static final MapCodec<hij.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ecc.a.fieldOf("wood_type").forGetter(hij.a::b), alg.a.optionalFieldOf("texture").forGetter(hij.a::c)).apply($$0, hij.a::new)
      );

      public a(ecc $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hij.a> a() {
         return a;
      }

      @Override
      public hio<?> a(gjk $$0) {
         ghg $$1 = gtj.a($$0, this.b, gtj.a.c);
         hlq $$2 = this.c.<hlq>map(grg.r::a).orElseGet(() -> grg.b(this.b));
         return new hij($$1, $$2);
      }
   }
}
