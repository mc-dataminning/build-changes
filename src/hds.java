import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class hds implements hdt {
   private final gcx a;
   private final hha b;

   public hds(gcx $$0, hha $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(cwo $$0, ffv $$1, glz $$2, int $$3, int $$4, boolean $$5) {
      gov.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(dyk b, Optional<akv> c) implements hdx.a {
      public static final MapCodec<hds.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dyk.a.fieldOf("wood_type").forGetter(hds.a::b), akv.a.optionalFieldOf("texture").forGetter(hds.a::c)).apply($$0, hds.a::new)
      );

      public a(dyk $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hds.a> a() {
         return a;
      }

      @Override
      public hdx<?> a(gfa $$0) {
         gcx $$1 = gov.a($$0, this.b, gov.a.c);
         hha $$2 = this.c.<hha>map(gmu::d).orElseGet(() -> gmu.b(this.b));
         return new hds($$1, $$2);
      }
   }
}
