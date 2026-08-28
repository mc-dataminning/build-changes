import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class hdl implements hdm {
   private final gct a;
   private final hgt b;

   public hdl(gct $$0, hgt $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(cwl $$0, ffs $$1, glv $$2, int $$3, int $$4, boolean $$5) {
      gor.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(dyh b, Optional<aku> c) implements hdq.a {
      public static final MapCodec<hdl.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dyh.a.fieldOf("wood_type").forGetter(hdl.a::b), aku.a.optionalFieldOf("texture").forGetter(hdl.a::c)).apply($$0, hdl.a::new)
      );

      public a(dyh $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hdl.a> a() {
         return a;
      }

      @Override
      public hdq<?> a(gew $$0) {
         gct $$1 = gor.a($$0, this.b, gor.a.c);
         hgt $$2 = this.c.<hgt>map(gmq::d).orElseGet(() -> gmq.b(this.b));
         return new hdl($$1, $$2);
      }
   }
}
