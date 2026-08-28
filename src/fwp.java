import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fwp {
   private final Consumer<fuj> a;
   private final Consumer<fuj> b;
   @Nullable
   private fwo c;
   @Nullable
   private fys d;

   public fwp(Consumer<fuj> $$0, Consumer<fuj> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fys $$0) {
      this.d = $$0;
      fwo $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fwo $$0, boolean $$1) {
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
            frd.Q().ak().a(hos.a(awp.Bv, 1.0F));
         }
      }
   }

   @Nullable
   public fwo a() {
      return this.c;
   }
}
