import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record lb(Optional<bf<asi<wy>, lb.a>> c, Optional<String> d, Optional<String> e, cv.d f, Optional<Boolean> g) implements dk<dci> {
   public static final Codec<lb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bf.a(lb.a.a).optionalFieldOf("pages").forGetter(lb::b),
               Codec.STRING.optionalFieldOf("author").forGetter(lb::c),
               Codec.STRING.optionalFieldOf("title").forGetter(lb::d),
               cv.d.d.optionalFieldOf("generation", cv.d.c).forGetter(lb::e),
               Codec.BOOL.optionalFieldOf("resolved").forGetter(lb::f)
            )
            .apply($$0, lb::new)
   );

   @Override
   public ki<dci> a() {
      return kj.V;
   }

   public boolean a(dci $$0) {
      if (this.d.isPresent() && !this.d.get().equals($$0.e())) {
         return false;
      } else if (this.e.isPresent() && !this.e.get().equals($$0.d().a())) {
         return false;
      } else if (!this.f.d($$0.f())) {
         return false;
      } else {
         return this.g.isPresent() && this.g.get() != $$0.g() ? false : !this.c.isPresent() || this.c.get().a($$0.a());
      }
   }

   public Optional<bf<asi<wy>, lb.a>> b() {
      return this.c;
   }

   public Optional<String> c() {
      return this.d;
   }

   public Optional<String> d() {
      return this.e;
   }

   public cv.d e() {
      return this.f;
   }

   public Optional<Boolean> f() {
      return this.g;
   }

   public static record a(wy b) implements Predicate<asi<wy>> {
      public static final Codec<lb.a> a = xa.a.xmap(lb.a::new, lb.a::a);

      public boolean a(asi<wy> $$0) {
         return $$0.a().equals(this.b);
      }

      public wy a() {
         return this.b;
      }
   }
}
