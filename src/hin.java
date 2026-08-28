import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class hin implements hio<dck> {
   private final dty.a a;
   private final gii b;
   @Nullable
   private final alg c;
   private final float d;

   public hin(dty.a $$0, gii $$1, @Nullable alg $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Nullable
   public dck a(czk $$0) {
      return $$0.a(kk.ak);
   }

   public void a(@Nullable dck $$0, czi $$1, fjy $$2, gqm $$3, int $$4, int $$5, boolean $$6) {
      gqx $$7 = gto.a(this.a, $$0, this.c);
      gto.a(null, 180.0F, this.d, $$2, $$3, $$4, this.b, $$7);
   }

   public static record a(dty.a b, Optional<alg> c, float d) implements hio.a {
      public static final MapCodec<hin.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dty.a.b.fieldOf("kind").forGetter(hin.a::b),
                  alg.a.optionalFieldOf("texture").forGetter(hin.a::c),
                  Codec.FLOAT.optionalFieldOf("animation", 0.0F).forGetter(hin.a::d)
               )
               .apply($$0, hin.a::new)
      );

      public a(dty.a $$0) {
         this($$0, Optional.empty(), 0.0F);
      }

      @Override
      public MapCodec<hin.a> a() {
         return a;
      }

      @Nullable
      @Override
      public hio<?> a(gjk $$0) {
         gii $$1 = gto.a($$0, this.b);
         alg $$2 = this.c.<alg>map($$0x -> $$0x.a((UnaryOperator<String>)($$0xx -> "textures/entity/" + $$0xx + ".png"))).orElse(null);
         return $$1 != null ? new hin(this.b, $$1, $$2, this.d) : null;
      }
   }
}
