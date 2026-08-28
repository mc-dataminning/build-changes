import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record ko(Optional<bg<dcp.b, ko.a>> c) implements dl<dcp> {
   public static final Codec<ko> a = RecordCodecBuilder.create($$0 -> $$0.group(bg.a(ko.a.a).optionalFieldOf("modifiers").forGetter(ko::b)).apply($$0, ko::new));

   @Override
   public kj<dcp> a() {
      return kk.o;
   }

   public boolean a(dcp $$0) {
      return !this.c.isPresent() || this.c.get().a($$0.b());
   }

   public Optional<bg<dcp.b, ko.a>> b() {
      return this.c;
   }

   public static record a(Optional<jj<byv>> b, Optional<ali> c, cw.c d, Optional<byy.a> e, Optional<bxe> f) implements Predicate<dcp.b> {
      public static final Codec<ko.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ju.a(mh.c).optionalFieldOf("attribute").forGetter(ko.a::a),
                  ali.a.optionalFieldOf("id").forGetter(ko.a::b),
                  cw.c.d.optionalFieldOf("amount", cw.c.c).forGetter(ko.a::c),
                  byy.a.f.optionalFieldOf("operation").forGetter(ko.a::d),
                  bxe.m.optionalFieldOf("slot").forGetter(ko.a::e)
               )
               .apply($$0, ko.a::new)
      );

      public boolean a(dcp.b $$0) {
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

      public Optional<jj<byv>> a() {
         return this.b;
      }

      public Optional<ali> b() {
         return this.c;
      }

      public cw.c c() {
         return this.d;
      }

      public Optional<byy.a> d() {
         return this.e;
      }

      public Optional<bxe> e() {
         return this.f;
      }
   }
}
