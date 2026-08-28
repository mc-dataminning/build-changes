import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class hfv implements hfw<dau> {
   private final dsc.a a;
   private final gfy b;
   @Nullable
   private final ald c;
   private final float d;

   public hfv(dsc.a $$0, gfy $$1, @Nullable ald $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Nullable
   public dau a(cxy $$0) {
      return $$0.a(kx.ai);
   }

   public void a(@Nullable dau $$0, cxw $$1, fho $$2, gny $$3, int $$4, int $$5, boolean $$6) {
      goi $$7 = gra.a(this.a, $$0, this.c);
      gra.a(null, 180.0F, this.d, $$2, $$3, $$4, this.b, $$7);
   }

   public static record a(dsc.a b, Optional<ald> c, float d) implements hfw.a {
      public static final MapCodec<hfv.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dsc.a.b.fieldOf("kind").forGetter(hfv.a::b),
                  ald.a.optionalFieldOf("texture").forGetter(hfv.a::c),
                  Codec.FLOAT.optionalFieldOf("animation", 0.0F).forGetter(hfv.a::d)
               )
               .apply($$0, hfv.a::new)
      );

      public a(dsc.a $$0) {
         this($$0, Optional.empty(), 0.0F);
      }

      @Override
      public MapCodec<hfv.a> a() {
         return a;
      }

      @Nullable
      @Override
      public hfw<?> a(ggz $$0) {
         gfy $$1 = gra.a($$0, this.b);
         ald $$2 = this.c.<ald>map($$0x -> $$0x.a((UnaryOperator<String>)($$0xx -> "textures/entity/" + $$0xx + ".png"))).orElse(null);
         return $$1 != null ? new hfv(this.b, $$1, $$2, this.d) : null;
      }
   }
}
