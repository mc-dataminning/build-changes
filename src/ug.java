import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record ug(String a, @Nullable gb b) implements uf {
   public ug(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static gb a(String $$0) {
      try {
         gc $$1 = new gc(new StringReader($$0));
         return $$1.t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<qs> getData(ds $$0) throws CommandSyntaxException {
      if (this.b != null) {
         List<? extends big> $$1 = this.b.b($$0);
         return $$1.stream().map(cl::b);
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
         if ($$0 instanceof ug $$1 && this.a.equals($$1.a)) {
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
