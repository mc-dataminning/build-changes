import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class heq implements her {
   private final gdv a;
   private final hhy b;

   public heq(gdv $$0, hhy $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(cxf $$0, fgr $$1, gmx $$2, int $$3, int $$4, boolean $$5) {
      gpt.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(dzd b, Optional<aku> c) implements hev.a {
      public static final MapCodec<heq.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dzd.a.fieldOf("wood_type").forGetter(heq.a::b), aku.a.optionalFieldOf("texture").forGetter(heq.a::c)).apply($$0, heq.a::new)
      );

      public a(dzd $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<heq.a> a() {
         return a;
      }

      @Override
      public hev<?> a(gfy $$0) {
         gdv $$1 = gpt.a($$0, this.b, gpt.a.c);
         hhy $$2 = this.c.<hhy>map(gns::d).orElseGet(() -> gns.b(this.b));
         return new heq($$1, $$2);
      }
   }
}
