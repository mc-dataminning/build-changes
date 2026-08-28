import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fve {
   private final Consumer<fsy> a;
   private final Consumer<fsy> b;
   @Nullable
   private fvd c;
   @Nullable
   private fxh d;

   public fve(Consumer<fsy> $$0, Consumer<fsy> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fxh $$0) {
      this.d = $$0;
      fvd $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fvd $$0, boolean $$1) {
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
            fpt.Q().ak().a(hnj.a(awn.Bv, 1.0F));
         }
      }
   }

   @Nullable
   public fvd a() {
      return this.c;
   }
}
