import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class hex implements her {
   private final gdv a;
   private final hhy b;

   public hex(gdv $$0, hhy $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(cxf $$0, fgr $$1, gmx $$2, int $$3, int $$4, boolean $$5) {
      gpx.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(dzd b, Optional<aku> c) implements hev.a {
      public static final MapCodec<hex.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dzd.a.fieldOf("wood_type").forGetter(hex.a::b), aku.a.optionalFieldOf("texture").forGetter(hex.a::c)).apply($$0, hex.a::new)
      );

      public a(dzd $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hex.a> a() {
         return a;
      }

      @Override
      public hev<?> a(gfy $$0) {
         gdv $$1 = gpx.a($$0, this.b, true);
         hhy $$2 = this.c.<hhy>map(gns::c).orElseGet(() -> gns.a(this.b));
         return new hex($$1, $$2);
      }
   }
}
