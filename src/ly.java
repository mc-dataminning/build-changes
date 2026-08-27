import com.google.gson.JsonObject;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ly extends ln {
   final cmd<?> a;

   public ly(cmd<?> $$0) {
      this.a = $$0;
   }

   public static ly a(cmd<? extends cls> $$0) {
      return new ly($$0);
   }

   public void a(Consumer<lo> $$0, final String $$1) {
      $$0.accept(new ln.a(clr.d) {
         @Override
         public cmd<?> c() {
            return ly.this.a;
         }

         @Override
         public aer b() {
            return new aer($$1);
         }

         @Nullable
         @Override
         public JsonObject d() {
            return null;
         }

         @Override
         public aer e() {
            return new aer("");
         }
      });
   }
}
