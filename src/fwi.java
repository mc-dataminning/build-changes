import javax.annotation.Nullable;

public abstract class fwi implements fwj {
   @Nullable
   private fwk a;
   private boolean b;

   @Override
   public final boolean aL_() {
      return this.b;
   }

   @Override
   public final void b_(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public fwk aM_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fwk $$0) {
      if (this.a != null) {
         this.a.a(false);
      }

      if ($$0 != null) {
         $$0.a(true);
      }

      this.a = $$0;
   }
}
