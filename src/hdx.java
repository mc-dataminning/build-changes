import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class hdx implements hdr {
   private final gcv a;
   private final hgy b;

   public hdx(gcv $$0, hgy $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(cwm $$0, fft $$1, glx $$2, int $$3, int $$4, boolean $$5) {
      gox.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(dyi b, Optional<akv> c) implements hdv.a {
      public static final MapCodec<hdx.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dyi.a.fieldOf("wood_type").forGetter(hdx.a::b), akv.a.optionalFieldOf("texture").forGetter(hdx.a::c)).apply($$0, hdx.a::new)
      );

      public a(dyi $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hdx.a> a() {
         return a;
      }

      @Override
      public hdv<?> a(gey $$0) {
         gcv $$1 = gox.a($$0, this.b, true);
         hgy $$2 = this.c.<hgy>map(gms::c).orElseGet(() -> gms.a(this.b));
         return new hdx($$1, $$2);
      }
   }
}
