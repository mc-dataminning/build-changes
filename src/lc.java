import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record lc(Optional<bg<asi<wy>, lc.a>> c, Optional<String> d, Optional<String> e, cw.d f, Optional<Boolean> g) implements dl<dcu> {
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
   public kj<dcu> a() {
      return kk.V;
   }

   public boolean a(dcu $$0) {
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

   public Optional<bg<asi<wy>, lc.a>> b() {
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

   public static record a(wy b) implements Predicate<asi<wy>> {
      public static final Codec<lc.a> a = xa.a.xmap(lc.a::new, lc.a::a);

      public boolean a(asi<wy> $$0) {
         return $$0.a().equals(this.b);
      }

      public wy a() {
         return this.b;
      }
   }
}
