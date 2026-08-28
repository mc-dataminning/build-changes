import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record kw(kw.a c) implements dl<dby> {
   public static final Codec<kw> a = kw.a.a.xmap(kw::new, kw::b);

   @Override
   public kj<dby> a() {
      return kk.ai;
   }

   public boolean a(dby $$0) {
      return this.c.a($$0);
   }

   public kw.a b() {
      return this.c;
   }

   public static record a(Optional<dby.a> b, Optional<Boolean> c, Optional<Boolean> d) implements Predicate<dby> {
      public static final Codec<kw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dby.a.g.optionalFieldOf("shape").forGetter(kw.a::a),
                  Codec.BOOL.optionalFieldOf("has_twinkle").forGetter(kw.a::b),
                  Codec.BOOL.optionalFieldOf("has_trail").forGetter(kw.a::c)
               )
               .apply($$0, kw.a::new)
      );

      public boolean a(dby $$0) {
         if (this.b.isPresent() && this.b.get() != $$0.a()) {
            return false;
         } else {
            return this.c.isPresent() && this.c.get() != $$0.e() ? false : !this.d.isPresent() || this.d.get() == $$0.d();
         }
      }

      public Optional<dby.a> a() {
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
