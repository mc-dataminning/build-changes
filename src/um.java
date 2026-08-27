import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record um(String d, @Nullable fm e) implements un {
   public static final MapCodec<um> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block").forGetter(um::b)).apply($$0, um::new));
   public static final un.a<um> b = new un.a<>(a, "block");

   public um(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static fm a(String $$0) {
      try {
         return fk.a().a(new StringReader($$0));
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<qw> a(dt $$0) {
      if (this.e != null) {
         akt $$1 = $$0.e();
         gw $$2 = this.e.c($$0);
         if ($$1.o($$2)) {
            dcz $$3 = $$1.c_($$2);
            if ($$3 != null) {
               return Stream.of($$3.m());
            }
         }
      }

      return Stream.empty();
   }

   @Override
   public un.a<?> a() {
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
         if ($$0 instanceof um $$1 && this.d.equals($$1.d)) {
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
   public fm c() {
      return this.e;
   }
}
