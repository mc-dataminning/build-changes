import com.google.gson.JsonObject;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class lz extends lo {
   final cmb<?> a;

   public lz(cmb<?> $$0) {
      this.a = $$0;
   }

   public static lz a(cmb<? extends clq> $$0) {
      return new lz($$0);
   }

   public void a(Consumer<lp> $$0, final String $$1) {
      $$0.accept(new lo.a(clp.d) {
         @Override
         public cmb<?> c() {
            return lz.this.a;
         }

         @Override
         public aep b() {
            return new aep($$1);
         }

         @Nullable
         @Override
         public JsonObject d() {
            return null;
         }

         @Override
         public aep e() {
            return new aep("");
         }
      });
   }
}
