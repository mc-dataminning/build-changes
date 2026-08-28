import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class hfr implements hfs {
   private final gew a;
   private final hiz b;

   public hfr(gew $$0, hiz $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(cxw $$0, fho $$1, gny $$2, int $$3, int $$4, boolean $$5) {
      gqv.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(eaa b, Optional<ald> c) implements hfw.a {
      public static final MapCodec<hfr.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(eaa.a.fieldOf("wood_type").forGetter(hfr.a::b), ald.a.optionalFieldOf("texture").forGetter(hfr.a::c)).apply($$0, hfr.a::new)
      );

      public a(eaa $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hfr.a> a() {
         return a;
      }

      @Override
      public hfw<?> a(ggz $$0) {
         gew $$1 = gqv.a($$0, this.b, gqv.a.c);
         hiz $$2 = this.c.<hiz>map(got::d).orElseGet(() -> got.b(this.b));
         return new hfr($$1, $$2);
      }
   }
}
