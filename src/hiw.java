import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class hiw implements hiq {
   private final ghl a;
   private final hlx b;

   public hiw(ghl $$0, hlx $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(czl $$0, fkd $$1, gqr $$2, int $$3, int $$4, boolean $$5) {
      gts.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(ech b, Optional<alg> c) implements hiu.a {
      public static final MapCodec<hiw.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ech.a.fieldOf("wood_type").forGetter(hiw.a::b), alg.a.optionalFieldOf("texture").forGetter(hiw.a::c)).apply($$0, hiw.a::new)
      );

      public a(ech $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hiw.a> a() {
         return a;
      }

      @Override
      public hiu<?> a(gjp $$0) {
         ghl $$1 = gts.a($$0, this.b, true);
         hlx $$2 = this.c.<hlx>map(grl.q::a).orElseGet(() -> grl.a(this.b));
         return new hiw($$1, $$2);
      }
   }
}
