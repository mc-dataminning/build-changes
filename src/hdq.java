import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class hdq implements hdr {
   private final gcv a;
   private final hgy b;

   public hdq(gcv $$0, hgy $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(cwm $$0, fft $$1, glx $$2, int $$3, int $$4, boolean $$5) {
      got.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(dyi b, Optional<akv> c) implements hdv.a {
      public static final MapCodec<hdq.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dyi.a.fieldOf("wood_type").forGetter(hdq.a::b), akv.a.optionalFieldOf("texture").forGetter(hdq.a::c)).apply($$0, hdq.a::new)
      );

      public a(dyi $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hdq.a> a() {
         return a;
      }

      @Override
      public hdv<?> a(gey $$0) {
         gcv $$1 = got.a($$0, this.b, got.a.c);
         hgy $$2 = this.c.<hgy>map(gms::d).orElseGet(() -> gms.b(this.b));
         return new hdq($$1, $$2);
      }
   }
}
