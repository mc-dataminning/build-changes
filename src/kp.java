import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record kp(Optional<bg<dcr.b, kp.a>> e) implements dm<dcr> {
   public static final Codec<kp> a = RecordCodecBuilder.create($$0 -> $$0.group(bg.a(kp.a.a).optionalFieldOf("modifiers").forGetter(kp::b)).apply($$0, kp::new));

   @Override
   public kk<dcr> a() {
      return kl.o;
   }

   public boolean a(dcr $$0) {
      return !this.e.isPresent() || this.e.get().a($$0.b());
   }

   public Optional<bg<dcr.b, kp.a>> b() {
      return this.e;
   }

   public static record a(Optional<jk<byx>> b, Optional<alk> c, cx.c d, Optional<bza.a> e, Optional<bxg> f) implements Predicate<dcr.b> {
      public static final Codec<kp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jv.a(mi.c).optionalFieldOf("attribute").forGetter(kp.a::a),
                  alk.a.optionalFieldOf("id").forGetter(kp.a::b),
                  cx.c.d.optionalFieldOf("amount", cx.c.c).forGetter(kp.a::c),
                  bza.a.f.optionalFieldOf("operation").forGetter(kp.a::d),
                  bxg.m.optionalFieldOf("slot").forGetter(kp.a::e)
               )
               .apply($$0, kp.a::new)
      );

      public boolean a(dcr.b $$0) {
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

      public Optional<jk<byx>> a() {
         return this.b;
      }

      public Optional<alk> b() {
         return this.c;
      }

      public cx.c c() {
         return this.d;
      }

      public Optional<bza.a> d() {
         return this.e;
      }

      public Optional<bxg> e() {
         return this.f;
      }
   }
}
