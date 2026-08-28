import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record kn(Optional<bf<dbp.b, kn.a>> c) implements dk<dbp> {
   public static final Codec<kn> a = RecordCodecBuilder.create($$0 -> $$0.group(bf.a(kn.a.a).optionalFieldOf("modifiers").forGetter(kn::b)).apply($$0, kn::new));

   @Override
   public ki<dbp> a() {
      return kj.o;
   }

   public boolean a(dbp $$0) {
      return !this.c.isPresent() || this.c.get().a($$0.b());
   }

   public Optional<bf<dbp.b, kn.a>> b() {
      return this.c;
   }

   public static record a(Optional<ji<byd>> b, Optional<alg> c, cv.c d, Optional<byg.a> e, Optional<bwo> f) implements Predicate<dbp.b> {
      public static final Codec<kn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jt.a(mg.c).optionalFieldOf("attribute").forGetter(kn.a::a),
                  alg.a.optionalFieldOf("id").forGetter(kn.a::b),
                  cv.c.d.optionalFieldOf("amount", cv.c.c).forGetter(kn.a::c),
                  byg.a.f.optionalFieldOf("operation").forGetter(kn.a::d),
                  bwo.m.optionalFieldOf("slot").forGetter(kn.a::e)
               )
               .apply($$0, kn.a::new)
      );

      public boolean a(dbp.b $$0) {
         if (this.b.isPresent() && !this.b.get().a($$0.a())) {
            return false;
         } else if (this.c.isPresent() && !this.c.get().equals($$0.b().a())) {
            return false;
         } else if (!this.d.d($$0.b().b())) {
            return false;
         } else {
            return this.e.isPresent() && this.e.get() != $$0.b().c() ? false : !this.f.isPresent() || this.f.get() == $$0.c();
         }
      }

      public Optional<ji<byd>> a() {
         return this.b;
      }

      public Optional<alg> b() {
         return this.c;
      }

      public cv.c c() {
         return this.d;
      }

      public Optional<byg.a> d() {
         return this.e;
      }

      public Optional<bwo> e() {
         return this.f;
      }
   }
}
