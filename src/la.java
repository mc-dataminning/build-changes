import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record la(Optional<bf<asg<String>, la.a>> c) implements dk<dcb> {
   public static final Codec<la> a = RecordCodecBuilder.create($$0 -> $$0.group(bf.a(la.a.a).optionalFieldOf("pages").forGetter(la::b)).apply($$0, la::new));

   @Override
   public ki<dcb> a() {
      return kj.U;
   }

   public boolean a(dcb $$0) {
      return !this.c.isPresent() || this.c.get().a($$0.a());
   }

   public Optional<bf<asg<String>, la.a>> b() {
      return this.c;
   }

   public static record a(String b) implements Predicate<asg<String>> {
      public static final Codec<la.a> a = Codec.STRING.xmap(la.a::new, la.a::a);

      public boolean a(asg<String> $$0) {
         return $$0.a().equals(this.b);
      }

      public String a() {
         return this.b;
      }
   }
}
