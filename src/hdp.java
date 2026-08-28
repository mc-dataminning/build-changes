import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class hdp implements hdq<czm> {
   private final dqr.a a;
   private final gdv b;
   @Nullable
   private final aku c;

   public hdp(dqr.a $$0, gdv $$1, @Nullable aku $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Nullable
   public czm a(cwn $$0) {
      return $$0.a(kv.ag);
   }

   public void a(@Nullable czm $$0, cwl $$1, ffs $$2, glv $$3, int $$4, int $$5, boolean $$6) {
      gmf $$7 = gow.a(this.a, $$0, this.c);
      gow.a(null, 180.0F, 0.0F, $$2, $$3, $$4, this.b, $$7);
   }

   public static record a(dqr.a b, Optional<aku> c) implements hdq.a {
      public static final MapCodec<hdp.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dqr.a.b.fieldOf("kind").forGetter(hdp.a::b), aku.a.optionalFieldOf("texture").forGetter(hdp.a::c)).apply($$0, hdp.a::new)
      );

      public a(dqr.a $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hdp.a> a() {
         return a;
      }

      @Nullable
      @Override
      public hdq<?> a(gew $$0) {
         gdv $$1 = gow.a($$0, this.b);
         aku $$2 = this.c.<aku>map($$0x -> $$0x.a((UnaryOperator<String>)($$0xx -> "textures/entity/" + $$0xx + ".png"))).orElse(null);
         return $$1 != null ? new hdp(this.b, $$1, $$2) : null;
      }
   }
}
