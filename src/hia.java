import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class hia implements hib<dcd> {
   private final dtr.a a;
   private final ghw b;
   @Nullable
   private final alg c;
   private final float d;

   public hia(dtr.a $$0, ghw $$1, @Nullable alg $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Nullable
   public dcd a(czd $$0) {
      return $$0.a(kj.ak);
   }

   public void a(@Nullable dcd $$0, czb $$1, fjj $$2, gqa $$3, int $$4, int $$5, boolean $$6) {
      gqk $$7 = gtc.a(this.a, $$0, this.c);
      gtc.a(null, 180.0F, this.d, $$2, $$3, $$4, this.b, $$7);
   }

   public static record a(dtr.a b, Optional<alg> c, float d) implements hib.a {
      public static final MapCodec<hia.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dtr.a.b.fieldOf("kind").forGetter(hia.a::b),
                  alg.a.optionalFieldOf("texture").forGetter(hia.a::c),
                  Codec.FLOAT.optionalFieldOf("animation", 0.0F).forGetter(hia.a::d)
               )
               .apply($$0, hia.a::new)
      );

      public a(dtr.a $$0) {
         this($$0, Optional.empty(), 0.0F);
      }

      @Override
      public MapCodec<hia.a> a() {
         return a;
      }

      @Nullable
      @Override
      public hib<?> a(giy $$0) {
         ghw $$1 = gtc.a($$0, this.b);
         alg $$2 = this.c.<alg>map($$0x -> $$0x.a((UnaryOperator<String>)($$0xx -> "textures/entity/" + $$0xx + ".png"))).orElse(null);
         return $$1 != null ? new hia(this.b, $$1, $$2, this.d) : null;
      }
   }
}
