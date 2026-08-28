import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record kn(Optional<bf<dbj.b, kn.a>> c) implements dk<dbj> {
   public static final Codec<kn> a = RecordCodecBuilder.create($$0 -> $$0.group(bf.a(kn.a.a).optionalFieldOf("modifiers").forGetter(kn::b)).apply($$0, kn::new));

   @Override
   public ki<dbj> a() {
      return kj.o;
   }

   public boolean a(dbj $$0) {
      return !this.c.isPresent() || this.c.get().a($$0.b());
   }

   public Optional<bf<dbj.b, kn.a>> b() {
      return this.c;
   }

   public static record a(Optional<ji<bya>> b, Optional<ale> c, cv.c d, Optional<byd.a> e, Optional<bwl> f) implements Predicate<dbj.b> {
      public static final Codec<kn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jt.a(mg.c).optionalFieldOf("attribute").forGetter(kn.a::a),
                  ale.a.optionalFieldOf("id").forGetter(kn.a::b),
                  cv.c.d.optionalFieldOf("amount", cv.c.c).forGetter(kn.a::c),
                  byd.a.f.optionalFieldOf("operation").forGetter(kn.a::d),
                  bwl.m.optionalFieldOf("slot").forGetter(kn.a::e)
               )
               .apply($$0, kn.a::new)
      );

      public boolean a(dbj.b $$0) {
         if (this.b.isPresent() && !this.b.get().a($$0.a())) {
            return false;
         } else if (this.c.isPresent() && !this.c.get().equals($$0.b().b())) {
            return false;
         } else if (!this.d.d($$0.b().c())) {
            return false;
         } else {
            return this.e.isPresent() && this.e.get() != $$0.b().d() ? false : !this.f.isPresent() || this.f.get() == $$0.c();
         }
      }

      public Optional<ji<bya>> a() {
         return this.b;
      }

      public Optional<ale> b() {
         return this.c;
      }

      public cv.c c() {
         return this.d;
      }

      public Optional<byd.a> d() {
         return this.e;
      }

      public Optional<bwl> e() {
         return this.f;
      }
   }
}
