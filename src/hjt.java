import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class hjt implements hju<ddk> {
   private final dva.a a;
   private final gjl b;
   @Nullable
   private final alr c;
   private final float d;

   public hjt(dva.a $$0, gjl $$1, @Nullable alr $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Nullable
   public ddk a(dak $$0) {
      return $$0.a(kl.ak);
   }

   public void a(@Nullable ddk $$0, dai $$1, fld $$2, grn $$3, int $$4, int $$5, boolean $$6) {
      gry $$7 = guq.a(this.a, $$0, this.c);
      guq.a(null, 180.0F, this.d, $$2, $$3, $$4, this.b, $$7);
   }

   public static record a(dva.a b, Optional<alr> c, float d) implements hju.a {
      public static final MapCodec<hjt.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dva.a.b.fieldOf("kind").forGetter(hjt.a::b),
                  alr.a.optionalFieldOf("texture").forGetter(hjt.a::c),
                  Codec.FLOAT.optionalFieldOf("animation", 0.0F).forGetter(hjt.a::d)
               )
               .apply($$0, hjt.a::new)
      );

      public a(dva.a $$0) {
         this($$0, Optional.empty(), 0.0F);
      }

      @Override
      public MapCodec<hjt.a> a() {
         return a;
      }

      @Nullable
      @Override
      public hju<?> a(gkn $$0) {
         gjl $$1 = guq.a($$0, this.b);
         alr $$2 = this.c.<alr>map($$0x -> $$0x.a((UnaryOperator<String>)($$0xx -> "textures/entity/" + $$0xx + ".png"))).orElse(null);
         return $$1 != null ? new hjt(this.b, $$1, $$2, this.d) : null;
      }
   }
}
