import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record lc(Optional<bg<asm<String>, lc.a>> e) implements dm<ddj> {
   public static final Codec<lc> a = RecordCodecBuilder.create($$0 -> $$0.group(bg.a(lc.a.a).optionalFieldOf("pages").forGetter(lc::b)).apply($$0, lc::new));

   @Override
   public kk<ddj> a() {
      return kl.U;
   }

   public boolean a(ddj $$0) {
      return !this.e.isPresent() || this.e.get().a($$0.a());
   }

   public Optional<bg<asm<String>, lc.a>> b() {
      return this.e;
   }

   public static record a(String b) implements Predicate<asm<String>> {
      public static final Codec<lc.a> a = Codec.STRING.xmap(lc.a::new, lc.a::a);

      public boolean a(asm<String> $$0) {
         return $$0.a().equals(this.b);
      }

      public String a() {
         return this.b;
      }
   }
}
