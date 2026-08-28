import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class hho implements hhp {
   private final ggm a;
   private final hkw b;

   public hho(ggm $$0, hkw $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(cyw $$0, fjc $$1, gps $$2, int $$3, int $$4, boolean $$5) {
      gsp.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(ebn b, Optional<alg> c) implements hht.a {
      public static final MapCodec<hho.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ebn.a.fieldOf("wood_type").forGetter(hho.a::b), alg.a.optionalFieldOf("texture").forGetter(hho.a::c)).apply($$0, hho.a::new)
      );

      public a(ebn $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hho.a> a() {
         return a;
      }

      @Override
      public hht<?> a(giq $$0) {
         ggm $$1 = gsp.a($$0, this.b, gsp.a.c);
         hkw $$2 = this.c.<hkw>map(gqn.r::a).orElseGet(() -> gqn.b(this.b));
         return new hho($$1, $$2);
      }
   }
}
