import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class hkf implements hkg<dda> {
   private final duq.a a;
   private final gka b;
   @Nullable
   private final alk c;
   private final float d;

   public hkf(duq.a $$0, gka $$1, @Nullable alk $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Nullable
   public dda a(daa $$0) {
      return $$0.a(kl.ak);
   }

   public void a(@Nullable dda $$0, czy $$1, flq $$2, gsc $$3, int $$4, int $$5, boolean $$6) {
      gsn $$7 = gvf.a(this.a, $$0, this.c);
      gvf.a(null, 180.0F, this.d, $$2, $$3, $$4, this.b, $$7);
   }

   public static record a(duq.a b, Optional<alk> c, float d) implements hkg.a {
      public static final MapCodec<hkf.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  duq.a.b.fieldOf("kind").forGetter(hkf.a::b),
                  alk.a.optionalFieldOf("texture").forGetter(hkf.a::c),
                  Codec.FLOAT.optionalFieldOf("animation", 0.0F).forGetter(hkf.a::d)
               )
               .apply($$0, hkf.a::new)
      );

      public a(duq.a $$0) {
         this($$0, Optional.empty(), 0.0F);
      }

      @Override
      public MapCodec<hkf.a> a() {
         return a;
      }

      @Nullable
      @Override
      public hkg<?> a(glc $$0) {
         gka $$1 = gvf.a($$0, this.b);
         alk $$2 = this.c.<alk>map($$0x -> $$0x.a((UnaryOperator<String>)($$0xx -> "textures/entity/" + $$0xx + ".png"))).orElse(null);
         return $$1 != null ? new hkf(this.b, $$1, $$2, this.d) : null;
      }
   }
}
