import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class hip implements hiq {
   private final ghl a;
   private final hlx b;

   public hip(ghl $$0, hlx $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(czl $$0, fkd $$1, gqr $$2, int $$3, int $$4, boolean $$5) {
      gto.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(ech b, Optional<alg> c) implements hiu.a {
      public static final MapCodec<hip.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ech.a.fieldOf("wood_type").forGetter(hip.a::b), alg.a.optionalFieldOf("texture").forGetter(hip.a::c)).apply($$0, hip.a::new)
      );

      public a(ech $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hip.a> a() {
         return a;
      }

      @Override
      public hiu<?> a(gjp $$0) {
         ghl $$1 = gto.a($$0, this.b, gto.a.c);
         hlx $$2 = this.c.<hlx>map(grl.r::a).orElseGet(() -> grl.b(this.b));
         return new hip($$1, $$2);
      }
   }
}
