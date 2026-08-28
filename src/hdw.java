import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class hdw implements hdx<czp> {
   private final dqu.a a;
   private final gdz b;
   @Nullable
   private final akv c;
   private final float d;

   public hdw(dqu.a $$0, gdz $$1, @Nullable akv $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Nullable
   public czp a(cwq $$0) {
      return $$0.a(kv.ag);
   }

   public void a(@Nullable czp $$0, cwo $$1, ffv $$2, glz $$3, int $$4, int $$5, boolean $$6) {
      gmj $$7 = gpa.a(this.a, $$0, this.c);
      gpa.a(null, 180.0F, this.d, $$2, $$3, $$4, this.b, $$7);
   }

   public static record a(dqu.a b, Optional<akv> c, float d) implements hdx.a {
      public static final MapCodec<hdw.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dqu.a.b.fieldOf("kind").forGetter(hdw.a::b),
                  akv.a.optionalFieldOf("texture").forGetter(hdw.a::c),
                  Codec.FLOAT.optionalFieldOf("animation", 0.0F).forGetter(hdw.a::d)
               )
               .apply($$0, hdw.a::new)
      );

      public a(dqu.a $$0) {
         this($$0, Optional.empty(), 0.0F);
      }

      @Override
      public MapCodec<hdw.a> a() {
         return a;
      }

      @Nullable
      @Override
      public hdx<?> a(gfa $$0) {
         gdz $$1 = gpa.a($$0, this.b);
         akv $$2 = this.c.<akv>map($$0x -> $$0x.a((UnaryOperator<String>)($$0xx -> "textures/entity/" + $$0xx + ".png"))).orElse(null);
         return $$1 != null ? new hdw(this.b, $$1, $$2, this.d) : null;
      }
   }
}
