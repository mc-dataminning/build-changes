import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record lc(Optional<bg<ask<xa>, lc.a>> c, Optional<String> d, Optional<String> e, cw.d f, Optional<Boolean> g) implements dl<ddi> {
   public static final Codec<lc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bg.a(lc.a.a).optionalFieldOf("pages").forGetter(lc::b),
               Codec.STRING.optionalFieldOf("author").forGetter(lc::c),
               Codec.STRING.optionalFieldOf("title").forGetter(lc::d),
               cw.d.d.optionalFieldOf("generation", cw.d.c).forGetter(lc::e),
               Codec.BOOL.optionalFieldOf("resolved").forGetter(lc::f)
            )
            .apply($$0, lc::new)
   );

   @Override
   public kj<ddi> a() {
      return kk.V;
   }

   public boolean a(ddi $$0) {
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

   public Optional<bg<ask<xa>, lc.a>> b() {
      return this.c;
   }

   public Optional<String> c() {
      return this.d;
   }

   public Optional<String> d() {
      return this.e;
   }

   public cw.d e() {
      return this.f;
   }

   public Optional<Boolean> f() {
      return this.g;
   }

   public static record a(xa b) implements Predicate<ask<xa>> {
      public static final Codec<lc.a> a = xc.a.xmap(lc.a::new, lc.a::a);

      public boolean a(ask<xa> $$0) {
         return $$0.a().equals(this.b);
      }

      public xa a() {
         return this.b;
      }
   }
}
