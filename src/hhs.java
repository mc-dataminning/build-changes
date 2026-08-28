import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class hhs implements hht<dby> {
   private final dtk.a a;
   private final gho b;
   @Nullable
   private final alg c;
   private final float d;

   public hhs(dtk.a $$0, gho $$1, @Nullable alg $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Nullable
   public dby a(cyy $$0) {
      return $$0.a(kj.ak);
   }

   public void a(@Nullable dby $$0, cyw $$1, fjc $$2, gps $$3, int $$4, int $$5, boolean $$6) {
      gqc $$7 = gsu.a(this.a, $$0, this.c);
      gsu.a(null, 180.0F, this.d, $$2, $$3, $$4, this.b, $$7);
   }

   public static record a(dtk.a b, Optional<alg> c, float d) implements hht.a {
      public static final MapCodec<hhs.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dtk.a.b.fieldOf("kind").forGetter(hhs.a::b),
                  alg.a.optionalFieldOf("texture").forGetter(hhs.a::c),
                  Codec.FLOAT.optionalFieldOf("animation", 0.0F).forGetter(hhs.a::d)
               )
               .apply($$0, hhs.a::new)
      );

      public a(dtk.a $$0) {
         this($$0, Optional.empty(), 0.0F);
      }

      @Override
      public MapCodec<hhs.a> a() {
         return a;
      }

      @Nullable
      @Override
      public hht<?> a(giq $$0) {
         gho $$1 = gsu.a($$0, this.b);
         alg $$2 = this.c.<alg>map($$0x -> $$0x.a((UnaryOperator<String>)($$0xx -> "textures/entity/" + $$0xx + ".png"))).orElse(null);
         return $$1 != null ? new hhs(this.b, $$1, $$2, this.d) : null;
      }
   }
}
