import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record lb(Optional<bf<asg<ww>, lb.a>> c, Optional<String> d, Optional<String> e, cv.d f, Optional<Boolean> g) implements dk<dcc> {
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
   public ki<dcc> a() {
      return kj.V;
   }

   public boolean a(dcc $$0) {
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

   public Optional<bf<asg<ww>, lb.a>> b() {
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

   public static record a(ww b) implements Predicate<asg<ww>> {
      public static final Codec<lb.a> a = wy.a.xmap(lb.a::new, lb.a::a);

      public boolean a(asg<ww> $$0) {
         return $$0.a().equals(this.b);
      }

      public ww a() {
         return this.b;
      }
   }
}
