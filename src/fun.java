import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fun {
   private final Consumer<fsh> a;
   private final Consumer<fsh> b;
   @Nullable
   private fum c;
   @Nullable
   private fwq d;

   public fun(Consumer<fsh> $$0, Consumer<fsh> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fwq $$0) {
      this.d = $$0;
      fum $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fum $$0, boolean $$1) {
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
            foz.Q().ak().a(hmp.a(awn.Bv, 1.0F));
         }
      }
   }

   @Nullable
   public fum a() {
      return this.c;
   }
}
