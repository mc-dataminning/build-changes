import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fwr {
   private final Consumer<ful> a;
   private final Consumer<ful> b;
   @Nullable
   private fwq c;
   @Nullable
   private fyu d;

   public fwr(Consumer<ful> $$0, Consumer<ful> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fyu $$0) {
      this.d = $$0;
      fwq $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fwq $$0, boolean $$1) {
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
            frf.Q().ak().a(hou.a(awr.Bv, 1.0F));
         }
      }
   }

   @Nullable
   public fwq a() {
      return this.c;
   }
}
