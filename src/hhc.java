import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class hhc implements hhd<dbs> {
   private final dtc.a a;
   private final ghb b;
   @Nullable
   private final ale c;
   private final float d;

   public hhc(dtc.a $$0, ghb $$1, @Nullable ale $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Nullable
   public dbs a(cys $$0) {
      return $$0.a(kj.ak);
   }

   public void a(@Nullable dbs $$0, cyq $$1, fiq $$2, gpd $$3, int $$4, int $$5, boolean $$6) {
      gpn $$7 = gsf.a(this.a, $$0, this.c);
      gsf.a(null, 180.0F, this.d, $$2, $$3, $$4, this.b, $$7);
   }

   public static record a(dtc.a b, Optional<ale> c, float d) implements hhd.a {
      public static final MapCodec<hhc.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dtc.a.b.fieldOf("kind").forGetter(hhc.a::b),
                  ale.a.optionalFieldOf("texture").forGetter(hhc.a::c),
                  Codec.FLOAT.optionalFieldOf("animation", 0.0F).forGetter(hhc.a::d)
               )
               .apply($$0, hhc.a::new)
      );

      public a(dtc.a $$0) {
         this($$0, Optional.empty(), 0.0F);
      }

      @Override
      public MapCodec<hhc.a> a() {
         return a;
      }

      @Nullable
      @Override
      public hhd<?> a(gic $$0) {
         ghb $$1 = gsf.a($$0, this.b);
         ale $$2 = this.c.<ale>map($$0x -> $$0x.a((UnaryOperator<String>)($$0xx -> "textures/entity/" + $$0xx + ".png"))).orElse(null);
         return $$1 != null ? new hhc(this.b, $$1, $$2, this.d) : null;
      }
   }
}
