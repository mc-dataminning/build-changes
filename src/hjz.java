import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class hjz implements hka {
   private final giw a;
   private final hnh b;

   public hjz(giw $$0, hnh $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(czw $$0, flo $$1, gsa $$2, int $$3, int $$4, boolean $$5) {
      guy.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   public static record a(ecs b, Optional<ali> c) implements hke.a {
      public static final MapCodec<hjz.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ecs.a.fieldOf("wood_type").forGetter(hjz.a::b), ali.a.optionalFieldOf("texture").forGetter(hjz.a::c)).apply($$0, hjz.a::new)
      );

      public a(ecs $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hjz.a> a() {
         return a;
      }

      @Override
      public hke<?> a(gla $$0) {
         giw $$1 = guy.a($$0, this.b, guy.a.c);
         hnh $$2 = this.c.<hnh>map(gsu.r::a).orElseGet(() -> gsu.b(this.b));
         return new hjz($$1, $$2);
      }
   }
}
