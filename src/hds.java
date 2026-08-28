import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class hds implements hdm {
   private final gct a;
   private final hgt b;

   public hds(gct $$0, hgt $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(cwl $$0, ffs $$1, glv $$2, int $$3, int $$4, boolean $$5) {
      gov.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(dyh b, Optional<aku> c) implements hdq.a {
      public static final MapCodec<hds.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dyh.a.fieldOf("wood_type").forGetter(hds.a::b), aku.a.optionalFieldOf("texture").forGetter(hds.a::c)).apply($$0, hds.a::new)
      );

      public a(dyh $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hds.a> a() {
         return a;
      }

      @Override
      public hdq<?> a(gew $$0) {
         gct $$1 = gov.a($$0, this.b, true);
         hgt $$2 = this.c.<hgt>map(gmq::c).orElseGet(() -> gmq.a(this.b));
         return new hds($$1, $$2);
      }
   }
}
