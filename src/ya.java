import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record ya(String d, @Nullable gr e) implements yb {
   public static final MapCodec<ya> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block").forGetter(ya::b)).apply($$0, ya::new));
   public static final yb.a<ya> b = new yb.a<>(a, "block");

   public ya(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static gr a(String $$0) {
      try {
         return gp.a().a(new StringReader($$0));
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<ub> a(et $$0) {
      if (this.e != null) {
         aqu $$1 = $$0.e();
         jd $$2 = this.e.c($$0);
         if ($$1.p($$2)) {
            dqh $$3 = $$1.c_($$2);
            if ($$3 != null) {
               return Stream.of($$3.b($$0.v()));
            }
         }
      }

      return Stream.empty();
   }

   @Override
   public yb.a<?> a() {
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
         if ($$0 instanceof ya $$1 && this.d.equals($$1.d)) {
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
   public gr c() {
      return this.e;
   }
}
