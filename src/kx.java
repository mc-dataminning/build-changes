import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record kx(kx.a e) implements dm<dcy> {
   public static final Codec<kx> a = kx.a.a.xmap(kx::new, kx::b);

   @Override
   public kk<dcy> a() {
      return kl.ai;
   }

   public boolean a(dcy $$0) {
      return this.e.a($$0);
   }

   public kx.a b() {
      return this.e;
   }

   public static record a(Optional<dcy.a> b, Optional<Boolean> c, Optional<Boolean> d) implements Predicate<dcy> {
      public static final Codec<kx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dcy.a.g.optionalFieldOf("shape").forGetter(kx.a::a),
                  Codec.BOOL.optionalFieldOf("has_twinkle").forGetter(kx.a::b),
                  Codec.BOOL.optionalFieldOf("has_trail").forGetter(kx.a::c)
               )
               .apply($$0, kx.a::new)
      );

      public boolean a(dcy $$0) {
         if (this.b.isPresent() && this.b.get() != $$0.a()) {
            return false;
         } else {
            return this.c.isPresent() && this.c.get() != $$0.e() ? false : !this.d.isPresent() || this.d.get() == $$0.d();
         }
      }

      public Optional<dcy.a> a() {
         return this.b;
      }

      public Optional<Boolean> b() {
         return this.c;
      }

      public Optional<Boolean> c() {
         return this.d;
      }
   }
}
