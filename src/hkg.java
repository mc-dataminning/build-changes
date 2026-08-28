import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class hkg implements hka {
   private final giw a;
   private final hnh b;

   public hkg(giw $$0, hnh $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(czw $$0, flo $$1, gsa $$2, int $$3, int $$4, boolean $$5) {
      gvc.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(ecs b, Optional<ali> c) implements hke.a {
      public static final MapCodec<hkg.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ecs.a.fieldOf("wood_type").forGetter(hkg.a::b), ali.a.optionalFieldOf("texture").forGetter(hkg.a::c)).apply($$0, hkg.a::new)
      );

      public a(ecs $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hkg.a> a() {
         return a;
      }

      @Override
      public hke<?> a(gla $$0) {
         giw $$1 = gvc.a($$0, this.b, true);
         hnh $$2 = this.c.<hnh>map(gsu.q::a).orElseGet(() -> gsu.a(this.b));
         return new hkg($$1, $$2);
      }
   }
}
