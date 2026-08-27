import java.util.Optional;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ui implements tg {
   private final String b;
   @Nullable
   private Supplier<tf> c;

   public ui(String $$0) {
      this.b = $$0;
   }

   private tf b() {
      if (this.c == null) {
         this.c = uj.a.apply(this.b);
      }

      return this.c.get();
   }

   @Override
   public <T> Optional<T> a(tj.a<T> $$0) {
      return this.b().a($$0);
   }

   @Override
   public <T> Optional<T> a(tj.b<T> $$0, ub $$1) {
      return this.b().a($$0, $$1);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ui $$1 && this.b.equals($$1.b)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   @Override
   public String toString() {
      return "keybind{" + this.b + "}";
   }

   public String a() {
      return this.b;
   }
}
