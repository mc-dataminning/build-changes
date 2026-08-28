import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class hdu implements hdv<czn> {
   private final dqs.a a;
   private final gdx b;
   @Nullable
   private final akv c;
   private final float d;

   public hdu(dqs.a $$0, gdx $$1, @Nullable akv $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Nullable
   public czn a(cwo $$0) {
      return $$0.a(kv.ag);
   }

   public void a(@Nullable czn $$0, cwm $$1, fft $$2, glx $$3, int $$4, int $$5, boolean $$6) {
      gmh $$7 = goy.a(this.a, $$0, this.c);
      goy.a(null, 180.0F, this.d, $$2, $$3, $$4, this.b, $$7);
   }

   public static record a(dqs.a b, Optional<akv> c, float d) implements hdv.a {
      public static final MapCodec<hdu.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dqs.a.b.fieldOf("kind").forGetter(hdu.a::b),
                  akv.a.optionalFieldOf("texture").forGetter(hdu.a::c),
                  Codec.FLOAT.optionalFieldOf("animation", 0.0F).forGetter(hdu.a::d)
               )
               .apply($$0, hdu.a::new)
      );

      public a(dqs.a $$0) {
         this($$0, Optional.empty(), 0.0F);
      }

      @Override
      public MapCodec<hdu.a> a() {
         return a;
      }

      @Nullable
      @Override
      public hdv<?> a(gey $$0) {
         gdx $$1 = goy.a($$0, this.b);
         akv $$2 = this.c.<akv>map($$0x -> $$0x.a((UnaryOperator<String>)($$0xx -> "textures/entity/" + $$0xx + ".png"))).orElse(null);
         return $$1 != null ? new hdu(this.b, $$1, $$2, this.d) : null;
      }
   }
}
