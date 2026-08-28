import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record lb(Optional<bg<ask<String>, lb.a>> c) implements dl<ddh> {
   public static final Codec<lb> a = RecordCodecBuilder.create($$0 -> $$0.group(bg.a(lb.a.a).optionalFieldOf("pages").forGetter(lb::b)).apply($$0, lb::new));

   @Override
   public kj<ddh> a() {
      return kk.U;
   }

   public boolean a(ddh $$0) {
      return !this.c.isPresent() || this.c.get().a($$0.a());
   }

   public Optional<bg<ask<String>, lb.a>> b() {
      return this.c;
   }

   public static record a(String b) implements Predicate<ask<String>> {
      public static final Codec<lb.a> a = Codec.STRING.xmap(lb.a::new, lb.a::a);

      public boolean a(ask<String> $$0) {
         return $$0.a().equals(this.b);
      }

      public String a() {
         return this.b;
      }
   }
}
