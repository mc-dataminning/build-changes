import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fuz {
   private final Consumer<fst> a;
   private final Consumer<fst> b;
   @Nullable
   private fuy c;
   @Nullable
   private fxc d;

   public fuz(Consumer<fst> $$0, Consumer<fst> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fxc $$0) {
      this.d = $$0;
      fuy $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fuy $$0, boolean $$1) {
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
            fpo.Q().ak().a(hnc.a(awn.Bv, 1.0F));
         }
      }
   }

   @Nullable
   public fuy a() {
      return this.c;
   }
}
