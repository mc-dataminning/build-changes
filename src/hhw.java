import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class hhw implements hhx {
   private final ggu a;
   private final hle b;

   public hhw(ggu $$0, hle $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(czb $$0, fjj $$1, gqa $$2, int $$3, int $$4, boolean $$5) {
      gsx.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(ebv b, Optional<alg> c) implements hib.a {
      public static final MapCodec<hhw.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ebv.a.fieldOf("wood_type").forGetter(hhw.a::b), alg.a.optionalFieldOf("texture").forGetter(hhw.a::c)).apply($$0, hhw.a::new)
      );

      public a(ebv $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hhw.a> a() {
         return a;
      }

      @Override
      public hib<?> a(giy $$0) {
         ggu $$1 = gsx.a($$0, this.b, gsx.a.c);
         hle $$2 = this.c.<hle>map(gqv.r::a).orElseGet(() -> gqv.b(this.b));
         return new hhw($$1, $$2);
      }
   }
}
