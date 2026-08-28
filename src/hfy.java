import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class hfy implements hfs {
   private final gew a;
   private final hiz b;

   public hfy(gew $$0, hiz $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(cxw $$0, fho $$1, gny $$2, int $$3, int $$4, boolean $$5) {
      gqz.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(eaa b, Optional<ald> c) implements hfw.a {
      public static final MapCodec<hfy.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(eaa.a.fieldOf("wood_type").forGetter(hfy.a::b), ald.a.optionalFieldOf("texture").forGetter(hfy.a::c)).apply($$0, hfy.a::new)
      );

      public a(eaa $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hfy.a> a() {
         return a;
      }

      @Override
      public hfw<?> a(ggz $$0) {
         gew $$1 = gqz.a($$0, this.b, true);
         hiz $$2 = this.c.<hiz>map(got::c).orElseGet(() -> got.a(this.b));
         return new hfy($$1, $$2);
      }
   }
}
