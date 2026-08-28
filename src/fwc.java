import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fwc {
   private final Consumer<ftw> a;
   private final Consumer<ftw> b;
   @Nullable
   private fwb c;
   @Nullable
   private fyf d;

   public fwc(Consumer<ftw> $$0, Consumer<ftw> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fyf $$0) {
      this.d = $$0;
      fwb $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fwb $$0, boolean $$1) {
      if (!Objects.equals(this.c, $$0)) {
         if (this.c != null) {
            this.c.a(this.b);
         }

         this.c = $$0;
         $$0.a(this.a);
         if (this.d != null) {
            $$0.a(this.d);
         }

         if ($$1) {
            fqq.Q().ak().a(hoi.a(awy.Bv, 1.0F));
         }
      }
   }

   @Nullable
   public fwb a() {
      return this.c;
   }
}
