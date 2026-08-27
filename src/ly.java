import com.google.gson.JsonObject;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ly extends ln {
   final cmc<?> a;

   public ly(cmc<?> $$0) {
      this.a = $$0;
   }

   public static ly a(cmc<? extends clr> $$0) {
      return new ly($$0);
   }

   public void a(Consumer<lo> $$0, final String $$1) {
      $$0.accept(new ln.a(clq.d) {
         @Override
         public cmc<?> c() {
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
