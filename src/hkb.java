import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class hkb implements hkc {
   private final giy a;
   private final hnj b;

   public hkb(giy $$0, hnj $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(czy $$0, flq $$1, gsc $$2, int $$3, int $$4, boolean $$5) {
      gva.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(ecu b, Optional<alk> c) implements hkg.a {
      public static final MapCodec<hkb.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ecu.a.fieldOf("wood_type").forGetter(hkb.a::b), alk.a.optionalFieldOf("texture").forGetter(hkb.a::c)).apply($$0, hkb.a::new)
      );

      public a(ecu $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hkb.a> a() {
         return a;
      }

      @Override
      public hkg<?> a(glc $$0) {
         giy $$1 = gva.a($$0, this.b, gva.a.c);
         hnj $$2 = this.c.<hnj>map(gsw.r::a).orElseGet(() -> gsw.b(this.b));
         return new hkb($$1, $$2);
      }
   }
}
