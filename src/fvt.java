import javax.annotation.Nullable;

public abstract class fvt implements fvu {
   @Nullable
   private fvv a;
   private boolean b;

   @Override
   public final boolean aH_() {
      return this.b;
   }

   @Override
   public final void b_(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public fvv aI_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fvv $$0) {
      if (this.a != null) {
         this.a.a(false);
      }

      if ($$0 != null) {
         $$0.a(true);
      }

      this.a = $$0;
   }
}
