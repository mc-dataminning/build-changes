import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record yq(String d, @Nullable gn e) implements yr {
   public static final MapCodec<yq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block").forGetter(yq::b)).apply($$0, yq::new));
   public static final yr.a<yq> b = new yr.a<>(a, "block");

   public yq(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static gn a(String $$0) {
      try {
         return gl.a().a(new StringReader($$0));
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<us> a(ep $$0) {
      if (this.e != null) {
         arf $$1 = $$0.e();
         iz $$2 = this.e.c($$0);
         if ($$1.p($$2)) {
            dph $$3 = $$1.c_($$2);
            if ($$3 != null) {
               return Stream.of($$3.b($$0.v()));
            }
         }
      }

      return Stream.empty();
   }

   @Override
   public yr.a<?> a() {
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
         if ($$0 instanceof yq $$1 && this.d.equals($$1.d)) {
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
   public gn c() {
      return this.e;
   }
}
