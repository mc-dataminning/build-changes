import java.util.function.Function;
import javax.annotation.Nullable;

public class giw<C extends giw.a<C>, D> {
   private final Function<C, D> a;
   @Nullable
   private C b;
   @Nullable
   private D c;

   public giw(Function<C, D> $$0) {
      this.a = $$0;
   }

   public D a(C $$0) {
      if ($$0 == this.b && this.c != null) {
         return this.c;
      } else {
         D $$1 = this.a.apply($$0);
         this.c = $$1;
         this.b = $$0;
         $$0.registerForCleaning(this);
         return $$1;
      }
   }

   public void a() {
      this.c = null;
      this.b = null;
   }

   @FunctionalInterface
   public interface a<C extends giw.a<C>> {
      void registerForCleaning(giw<C, ?> var1);
   }
}
