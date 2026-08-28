import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class hdy implements hds {
   private final gcw a;
   private final hgz b;

   public hdy(gcw $$0, hgz $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(cwn $$0, ffu $$1, gly $$2, int $$3, int $$4, boolean $$5) {
      goy.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(dyj b, Optional<akv> c) implements hdw.a {
      public static final MapCodec<hdy.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dyj.a.fieldOf("wood_type").forGetter(hdy.a::b), akv.a.optionalFieldOf("texture").forGetter(hdy.a::c)).apply($$0, hdy.a::new)
      );

      public a(dyj $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hdy.a> a() {
         return a;
      }

      @Override
      public hdw<?> a(gez $$0) {
         gcw $$1 = goy.a($$0, this.b, true);
         hgz $$2 = this.c.<hgz>map(gmt::c).orElseGet(() -> gmt.a(this.b));
         return new hdy($$1, $$2);
      }
   }
}
