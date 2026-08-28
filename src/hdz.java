import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class hdz implements hdt {
   private final gcx a;
   private final hha b;

   public hdz(gcx $$0, hha $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(cwo $$0, ffv $$1, glz $$2, int $$3, int $$4, boolean $$5) {
      goz.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(dyk b, Optional<akv> c) implements hdx.a {
      public static final MapCodec<hdz.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dyk.a.fieldOf("wood_type").forGetter(hdz.a::b), akv.a.optionalFieldOf("texture").forGetter(hdz.a::c)).apply($$0, hdz.a::new)
      );

      public a(dyk $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hdz.a> a() {
         return a;
      }

      @Override
      public hdx<?> a(gfa $$0) {
         gcx $$1 = goz.a($$0, this.b, true);
         hha $$2 = this.c.<hha>map(gmu::c).orElseGet(() -> gmu.a(this.b));
         return new hdz($$1, $$2);
      }
   }
}
