import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class hkd implements hke<dcy> {
   private final duo.a a;
   private final gjy b;
   @Nullable
   private final ali c;
   private final float d;

   public hkd(duo.a $$0, gjy $$1, @Nullable ali $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Nullable
   public dcy a(czy $$0) {
      return $$0.a(kk.ak);
   }

   public void a(@Nullable dcy $$0, czw $$1, flo $$2, gsa $$3, int $$4, int $$5, boolean $$6) {
      gsl $$7 = gvd.a(this.a, $$0, this.c);
      gvd.a(null, 180.0F, this.d, $$2, $$3, $$4, this.b, $$7);
   }

   public static record a(duo.a b, Optional<ali> c, float d) implements hke.a {
      public static final MapCodec<hkd.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  duo.a.b.fieldOf("kind").forGetter(hkd.a::b),
                  ali.a.optionalFieldOf("texture").forGetter(hkd.a::c),
                  Codec.FLOAT.optionalFieldOf("animation", 0.0F).forGetter(hkd.a::d)
               )
               .apply($$0, hkd.a::new)
      );

      public a(duo.a $$0) {
         this($$0, Optional.empty(), 0.0F);
      }

      @Override
      public MapCodec<hkd.a> a() {
         return a;
      }

      @Nullable
      @Override
      public hke<?> a(gla $$0) {
         gjy $$1 = gvd.a($$0, this.b);
         ali $$2 = this.c.<ali>map($$0x -> $$0x.a((UnaryOperator<String>)($$0xx -> "textures/entity/" + $$0xx + ".png"))).orElse(null);
         return $$1 != null ? new hkd(this.b, $$1, $$2, this.d) : null;
      }
   }
}
