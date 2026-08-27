import com.google.gson.JsonObject;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ly extends ln {
   final cje<?> a;

   public ly(cje<?> $$0) {
      this.a = $$0;
   }

   public static ly a(cje<? extends cit> $$0) {
      return new ly($$0);
   }

   public void a(Consumer<lo> $$0, final String $$1) {
      $$0.accept(new ln.a(cis.d) {
         @Override
         public cje<?> c() {
            return ly.this.a;
         }

         @Override
         public acq b() {
            return new acq($$1);
         }

         @Nullable
         @Override
         public JsonObject d() {
            return null;
         }

         @Override
         public acq e() {
            return new acq("");
         }
      });
   }
}
