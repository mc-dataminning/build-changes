import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record ul(String a, @Nullable fm b) implements um {
   public ul(String $$0) {
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
   public Stream<qx> getData(dt $$0) {
      if (this.b != null) {
         akr $$1 = $$0.e();
         gw $$2 = this.b.c($$0);
         if ($$1.o($$2)) {
            dcv $$3 = $$1.c_($$2);
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
         if ($$0 instanceof ul $$1 && this.a.equals($$1.a)) {
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
