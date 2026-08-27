import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record un(String a, @Nullable gc b) implements um {
   public un(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static gc a(String $$0) {
      try {
         gd $$1 = new gd(new StringReader($$0));
         return $$1.t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<qx> getData(dt $$0) throws CommandSyntaxException {
      if (this.b != null) {
         List<? extends biq> $$1 = this.b.b($$0);
         return $$1.stream().map(cn::b);
      } else {
         return Stream.empty();
      }
   }

   @Override
   public String toString() {
      return "entity=" + this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof un $$1 && this.a.equals($$1.a)) {
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
