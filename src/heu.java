import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class heu implements hev<dae> {
   private final drm.a a;
   private final gex b;
   @Nullable
   private final aku c;
   private final float d;

   public heu(drm.a $$0, gex $$1, @Nullable aku $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Nullable
   public dae a(cxh $$0) {
      return $$0.a(kv.ai);
   }

   public void a(@Nullable dae $$0, cxf $$1, fgr $$2, gmx $$3, int $$4, int $$5, boolean $$6) {
      gnh $$7 = gpy.a(this.a, $$0, this.c);
      gpy.a(null, 180.0F, this.d, $$2, $$3, $$4, this.b, $$7);
   }

   public static record a(drm.a b, Optional<aku> c, float d) implements hev.a {
      public static final MapCodec<heu.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  drm.a.b.fieldOf("kind").forGetter(heu.a::b),
                  aku.a.optionalFieldOf("texture").forGetter(heu.a::c),
                  Codec.FLOAT.optionalFieldOf("animation", 0.0F).forGetter(heu.a::d)
               )
               .apply($$0, heu.a::new)
      );

      public a(drm.a $$0) {
         this($$0, Optional.empty(), 0.0F);
      }

      @Override
      public MapCodec<heu.a> a() {
         return a;
      }

      @Nullable
      @Override
      public hev<?> a(gfy $$0) {
         gex $$1 = gpy.a($$0, this.b);
         aku $$2 = this.c.<aku>map($$0x -> $$0x.a((UnaryOperator<String>)($$0xx -> "textures/entity/" + $$0xx + ".png"))).orElse(null);
         return $$1 != null ? new heu(this.b, $$1, $$2, this.d) : null;
      }
   }
}
