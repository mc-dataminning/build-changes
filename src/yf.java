import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record yf(String d, @Nullable gs e) implements yg {
   public static final MapCodec<yf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block").forGetter(yf::b)).apply($$0, yf::new));
   public static final yg.a<yf> b = new yg.a<>(a, "block");

   public yf(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static gs a(String $$0) {
      try {
         return gq.a().a(new StringReader($$0));
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<ug> a(eu $$0) {
      if (this.e != null) {
         arj $$1 = $$0.e();
         jf $$2 = this.e.c($$0);
         if ($$1.p($$2)) {
            drv $$3 = $$1.c_($$2);
            if ($$3 != null) {
               return Stream.of($$3.b($$0.v()));
            }
         }
      }

      return Stream.empty();
   }

   @Override
   public yg.a<?> a() {
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
         if ($$0 instanceof yf $$1 && this.d.equals($$1.d)) {
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
   public gs c() {
      return this.e;
   }
}
