import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record ld(Optional<bg<ast<xg>, ld.a>> e, Optional<String> f, Optional<String> g, cx.d h, Optional<Boolean> i) implements dm<ddu> {
   public static final Codec<ld> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bg.a(ld.a.a).optionalFieldOf("pages").forGetter(ld::b),
               Codec.STRING.optionalFieldOf("author").forGetter(ld::c),
               Codec.STRING.optionalFieldOf("title").forGetter(ld::d),
               cx.d.d.optionalFieldOf("generation", cx.d.c).forGetter(ld::e),
               Codec.BOOL.optionalFieldOf("resolved").forGetter(ld::f)
            )
            .apply($$0, ld::new)
   );

   @Override
   public kk<ddu> a() {
      return kl.V;
   }

   public boolean a(ddu $$0) {
      if (this.f.isPresent() && !this.f.get().equals($$0.e())) {
         return false;
      } else if (this.g.isPresent() && !this.g.get().equals($$0.d().a())) {
         return false;
      } else if (!this.h.d($$0.f())) {
         return false;
      } else {
         return this.i.isPresent() && this.i.get() != $$0.g() ? false : !this.e.isPresent() || this.e.get().a($$0.a());
      }
   }

   public Optional<bg<ast<xg>, ld.a>> b() {
      return this.e;
   }

   public Optional<String> c() {
      return this.f;
   }

   public Optional<String> d() {
      return this.g;
   }

   public cx.d e() {
      return this.h;
   }

   public Optional<Boolean> f() {
      return this.i;
   }

   public static record a(xg b) implements Predicate<ast<xg>> {
      public static final Codec<ld.a> a = xi.a.xmap(ld.a::new, ld.a::a);

      public boolean a(ast<xg> $$0) {
         return $$0.a().equals(this.b);
      }

      public xg a() {
         return this.b;
      }
   }
}
