import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record uf(String a, @Nullable fk b) implements ug {
   public uf(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static fk a(String $$0) {
      try {
         return fi.a().a(new StringReader($$0));
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<qr> getData(dr $$0) {
      if (this.b != null) {
         akk $$1 = $$0.e();
         gu $$2 = this.b.c($$0);
         if ($$1.o($$2)) {
            dcl $$3 = $$1.c_($$2);
            if ($$3 != null) {
               return Stream.of($$3.m());
            }
         }
      }

      return Stream.empty();
   }

   @Override
   public String toString() {
      return "block=" + this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof uf $$1 && this.a.equals($$1.a)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }
}
