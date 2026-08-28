import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class hdr implements hds {
   private final gcw a;
   private final hgz b;

   public hdr(gcw $$0, hgz $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(cwn $$0, ffu $$1, gly $$2, int $$3, int $$4, boolean $$5) {
      gou.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(dyj b, Optional<akv> c) implements hdw.a {
      public static final MapCodec<hdr.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dyj.a.fieldOf("wood_type").forGetter(hdr.a::b), akv.a.optionalFieldOf("texture").forGetter(hdr.a::c)).apply($$0, hdr.a::new)
      );

      public a(dyj $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hdr.a> a() {
         return a;
      }

      @Override
      public hdw<?> a(gez $$0) {
         gcw $$1 = gou.a($$0, this.b, gou.a.c);
         hgz $$2 = this.c.<hgz>map(gmt::d).orElseGet(() -> gmt.b(this.b));
         return new hdr($$1, $$2);
      }
   }
}
