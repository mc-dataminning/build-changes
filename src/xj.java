import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record xj(String d, @Nullable fs e) implements xk {
   public static final MapCodec<xj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block").forGetter(xj::b)).apply($$0, xj::new));
   public static final xk.a<xj> b = new xk.a<>(a, "block");

   public xj(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static fs a(String $$0) {
      try {
         return fq.a().a(new StringReader($$0));
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<to> a(dv $$0) {
      if (this.e != null) {
         apu $$1 = $$0.e();
         id $$2 = this.e.c($$0);
         if ($$1.p($$2)) {
            dmo $$3 = $$1.c_($$2);
            if ($$3 != null) {
               return Stream.of($$3.b($$0.v()));
            }
         }
      }

      return Stream.empty();
   }

   @Override
   public xk.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "block=" + this.d;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof xj $$1 && this.d.equals($$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.d.hashCode();
   }

   public String b() {
      return this.d;
   }

   @Nullable
   public fs c() {
      return this.e;
   }
}
