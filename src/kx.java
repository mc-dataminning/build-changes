import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record kx(kx.a e) implements dm<dco> {
   public static final Codec<kx> a = kx.a.a.xmap(kx::new, kx::b);

   @Override
   public kk<dco> a() {
      return kl.ai;
   }

   public boolean a(dco $$0) {
      return this.e.a($$0);
   }

   public kx.a b() {
      return this.e;
   }

   public static record a(Optional<dco.a> b, Optional<Boolean> c, Optional<Boolean> d) implements Predicate<dco> {
      public static final Codec<kx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dco.a.g.optionalFieldOf("shape").forGetter(kx.a::a),
                  Codec.BOOL.optionalFieldOf("has_twinkle").forGetter(kx.a::b),
                  Codec.BOOL.optionalFieldOf("has_trail").forGetter(kx.a::c)
               )
               .apply($$0, kx.a::new)
      );

      public boolean a(dco $$0) {
         if (this.b.isPresent() && this.b.get() != $$0.a()) {
            return false;
         } else {
            return this.c.isPresent() && this.c.get() != $$0.e() ? false : !this.d.isPresent() || this.d.get() == $$0.d();
         }
      }

      public Optional<dco.a> a() {
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
