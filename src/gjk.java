import java.util.function.Function;
import javax.annotation.Nullable;

public class gjk<C extends gjk.a<C>, D> {
   private final Function<C, D> a;
   @Nullable
   private C b;
   @Nullable
   private D c;

   public gjk(Function<C, D> $$0) {
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
   public interface a<C extends gjk.a<C>> {
      void registerForCleaning(gjk<C, ?> var1);
   }
}
