import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class hit implements hiu<dcn> {
   private final dud.a a;
   private final gin b;
   @Nullable
   private final alg c;
   private final float d;

   public hit(dud.a $$0, gin $$1, @Nullable alg $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Nullable
   public dcn a(czn $$0) {
      return $$0.a(kk.ak);
   }

   public void a(@Nullable dcn $$0, czl $$1, fkd $$2, gqr $$3, int $$4, int $$5, boolean $$6) {
      grc $$7 = gtt.a(this.a, $$0, this.c);
      gtt.a(null, 180.0F, this.d, $$2, $$3, $$4, this.b, $$7);
   }

   public static record a(dud.a b, Optional<alg> c, float d) implements hiu.a {
      public static final MapCodec<hit.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dud.a.b.fieldOf("kind").forGetter(hit.a::b),
                  alg.a.optionalFieldOf("texture").forGetter(hit.a::c),
                  Codec.FLOAT.optionalFieldOf("animation", 0.0F).forGetter(hit.a::d)
               )
               .apply($$0, hit.a::new)
      );

      public a(dud.a $$0) {
         this($$0, Optional.empty(), 0.0F);
      }

      @Override
      public MapCodec<hit.a> a() {
         return a;
      }

      @Nullable
      @Override
      public hiu<?> a(gjp $$0) {
         gin $$1 = gtt.a($$0, this.b);
         alg $$2 = this.c.<alg>map($$0x -> $$0x.a((UnaryOperator<String>)($$0xx -> "textures/entity/" + $$0xx + ".png"))).orElse(null);
         return $$1 != null ? new hit(this.b, $$1, $$2, this.d) : null;
      }
   }
}
