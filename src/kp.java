import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record kp(Optional<bg<ddb.b, kp.a>> e) implements dm<ddb> {
   public static final Codec<kp> a = RecordCodecBuilder.create($$0 -> $$0.group(bg.a(kp.a.a).optionalFieldOf("modifiers").forGetter(kp::b)).apply($$0, kp::new));

   @Override
   public kk<ddb> a() {
      return kl.o;
   }

   public boolean a(ddb $$0) {
      return !this.e.isPresent() || this.e.get().a($$0.b());
   }

   public Optional<bg<ddb.b, kp.a>> b() {
      return this.e;
   }

   public static record a(Optional<jk<bzg>> b, Optional<alr> c, cx.c d, Optional<bzj.a> e, Optional<bxp> f) implements Predicate<ddb.b> {
      public static final Codec<kp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jv.a(mi.c).optionalFieldOf("attribute").forGetter(kp.a::a),
                  alr.a.optionalFieldOf("id").forGetter(kp.a::b),
                  cx.c.d.optionalFieldOf("amount", cx.c.c).forGetter(kp.a::c),
                  bzj.a.f.optionalFieldOf("operation").forGetter(kp.a::d),
                  bxp.m.optionalFieldOf("slot").forGetter(kp.a::e)
               )
               .apply($$0, kp.a::new)
      );

      public boolean a(ddb.b $$0) {
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

      public Optional<jk<bzg>> a() {
         return this.b;
      }

      public Optional<alr> b() {
         return this.c;
      }

      public cx.c c() {
         return this.d;
      }

      public Optional<bzj.a> d() {
         return this.e;
      }

      public Optional<bxp> e() {
         return this.f;
      }
   }
}
