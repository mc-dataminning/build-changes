import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record kv(kv.a c) implements dk<dbr> {
   public static final Codec<kv> a = kv.a.a.xmap(kv::new, kv::b);

   @Override
   public ki<dbr> a() {
      return kj.ai;
   }

   public boolean a(dbr $$0) {
      return this.c.a($$0);
   }

   public kv.a b() {
      return this.c;
   }

   public static record a(Optional<dbr.a> b, Optional<Boolean> c, Optional<Boolean> d) implements Predicate<dbr> {
      public static final Codec<kv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dbr.a.g.optionalFieldOf("shape").forGetter(kv.a::a),
                  Codec.BOOL.optionalFieldOf("has_twinkle").forGetter(kv.a::b),
                  Codec.BOOL.optionalFieldOf("has_trail").forGetter(kv.a::c)
               )
               .apply($$0, kv.a::new)
      );

      public boolean a(dbr $$0) {
         if (this.b.isPresent() && this.b.get() != $$0.a()) {
            return false;
         } else {
            return this.c.isPresent() && this.c.get() != $$0.e() ? false : !this.d.isPresent() || this.d.get() == $$0.d();
         }
      }

      public Optional<dbr.a> a() {
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
