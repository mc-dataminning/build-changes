import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record lb(Optional<bg<asi<String>, lb.a>> c) implements dl<dcw> {
   public static final Codec<lb> a = RecordCodecBuilder.create($$0 -> $$0.group(bg.a(lb.a.a).optionalFieldOf("pages").forGetter(lb::b)).apply($$0, lb::new));

   @Override
   public kj<dcw> a() {
      return kk.U;
   }

   public boolean a(dcw $$0) {
      return !this.c.isPresent() || this.c.get().a($$0.a());
   }

   public Optional<bg<asi<String>, lb.a>> b() {
      return this.c;
   }

   public static record a(String b) implements Predicate<asi<String>> {
      public static final Codec<lb.a> a = Codec.STRING.xmap(lb.a::new, lb.a::a);

      public boolean a(asi<String> $$0) {
         return $$0.a().equals(this.b);
      }

      public String a() {
         return this.b;
      }
   }
}
