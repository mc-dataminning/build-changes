import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class hdv implements hdw<czo> {
   private final dqt.a a;
   private final gdy b;
   @Nullable
   private final akv c;
   private final float d;

   public hdv(dqt.a $$0, gdy $$1, @Nullable akv $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Nullable
   public czo a(cwp $$0) {
      return $$0.a(kv.ag);
   }

   public void a(@Nullable czo $$0, cwn $$1, ffu $$2, gly $$3, int $$4, int $$5, boolean $$6) {
      gmi $$7 = goz.a(this.a, $$0, this.c);
      goz.a(null, 180.0F, this.d, $$2, $$3, $$4, this.b, $$7);
   }

   public static record a(dqt.a b, Optional<akv> c, float d) implements hdw.a {
      public static final MapCodec<hdv.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dqt.a.b.fieldOf("kind").forGetter(hdv.a::b),
                  akv.a.optionalFieldOf("texture").forGetter(hdv.a::c),
                  Codec.FLOAT.optionalFieldOf("animation", 0.0F).forGetter(hdv.a::d)
               )
               .apply($$0, hdv.a::new)
      );

      public a(dqt.a $$0) {
         this($$0, Optional.empty(), 0.0F);
      }

      @Override
      public MapCodec<hdv.a> a() {
         return a;
      }

      @Nullable
      @Override
      public hdw<?> a(gez $$0) {
         gdy $$1 = goz.a($$0, this.b);
         akv $$2 = this.c.<akv>map($$0x -> $$0x.a((UnaryOperator<String>)($$0xx -> "textures/entity/" + $$0xx + ".png"))).orElse(null);
         return $$1 != null ? new hdv(this.b, $$1, $$2, this.d) : null;
      }
   }
}
