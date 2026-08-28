import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record yb(String d, @Nullable gi e) implements yc {
   public static final MapCodec<yb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block").forGetter(yb::b)).apply($$0, yb::new));
   public static final yc.a<yb> b = new yc.a<>(a, "block");

   public yb(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static gi a(String $$0) {
      try {
         return gg.a().a(new StringReader($$0));
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<tz> a(ej $$0) {
      if (this.e != null) {
         ars $$1 = $$0.e();
         iv $$2 = this.e.c($$0);
         if ($$1.p($$2)) {
            dyc $$3 = $$1.c_($$2);
            if ($$3 != null) {
               return Stream.of($$3.b($$0.u()));
            }
         }
      }

      return Stream.empty();
   }

   @Override
   public yc.a<?> a() {
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
         if ($$0 instanceof yb $$1 && this.d.equals($$1.d)) {
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
   public gi c() {
      return this.e;
   }
}
