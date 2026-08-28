import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record ko(Optional<bg<dcb.b, ko.a>> c) implements dl<dcb> {
   public static final Codec<ko> a = RecordCodecBuilder.create($$0 -> $$0.group(bg.a(ko.a.a).optionalFieldOf("modifiers").forGetter(ko::b)).apply($$0, ko::new));

   @Override
   public kj<dcb> a() {
      return kk.o;
   }

   public boolean a(dcb $$0) {
      return !this.c.isPresent() || this.c.get().a($$0.b());
   }

   public Optional<bg<dcb.b, ko.a>> b() {
      return this.c;
   }

   public static record a(Optional<jj<byk>> b, Optional<alg> c, cw.c d, Optional<byn.a> e, Optional<bwt> f) implements Predicate<dcb.b> {
      public static final Codec<ko.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ju.a(mh.c).optionalFieldOf("attribute").forGetter(ko.a::a),
                  alg.a.optionalFieldOf("id").forGetter(ko.a::b),
                  cw.c.d.optionalFieldOf("amount", cw.c.c).forGetter(ko.a::c),
                  byn.a.f.optionalFieldOf("operation").forGetter(ko.a::d),
                  bwt.m.optionalFieldOf("slot").forGetter(ko.a::e)
               )
               .apply($$0, ko.a::new)
      );

      public boolean a(dcb.b $$0) {
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

      public Optional<jj<byk>> a() {
         return this.b;
      }

      public Optional<alg> b() {
         return this.c;
      }

      public cw.c c() {
         return this.d;
      }

      public Optional<byn.a> d() {
         return this.e;
      }

      public Optional<bwt> e() {
         return this.f;
      }
   }
}
