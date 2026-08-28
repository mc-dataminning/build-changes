import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class hhf implements hgz {
   private final gfz a;
   private final hkg b;

   public hhf(gfz $$0, hkg $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(cyq $$0, fiq $$1, gpd $$2, int $$3, int $$4, boolean $$5) {
      gse.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(ebc b, Optional<ale> c) implements hhd.a {
      public static final MapCodec<hhf.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ebc.a.fieldOf("wood_type").forGetter(hhf.a::b), ale.a.optionalFieldOf("texture").forGetter(hhf.a::c)).apply($$0, hhf.a::new)
      );

      public a(ebc $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hhf.a> a() {
         return a;
      }

      @Override
      public hhd<?> a(gic $$0) {
         gfz $$1 = gse.a($$0, this.b, true);
         hkg $$2 = this.c.<hkg>map(gpy.q::a).orElseGet(() -> gpy.a(this.b));
         return new hhf($$1, $$2);
      }
   }
}
