import java.util.Optional;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class uo implements tm {
   private final String b;
   @Nullable
   private Supplier<tl> c;

   public uo(String $$0) {
      this.b = $$0;
   }

   private tl b() {
      if (this.c == null) {
         this.c = up.a.apply(this.b);
      }

      return this.c.get();
   }

   @Override
   public <T> Optional<T> a(tp.a<T> $$0) {
      return this.b().a($$0);
   }

   @Override
   public <T> Optional<T> a(tp.b<T> $$0, uh $$1) {
      return this.b().a($$0, $$1);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof uo $$1 && this.b.equals($$1.b)) {
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
