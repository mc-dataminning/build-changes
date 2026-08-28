import javax.annotation.Nullable;

public abstract class fwg implements fwh {
   @Nullable
   private fwi a;
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
   public fwi aM_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fwi $$0) {
      if (this.a != null) {
         this.a.a(false);
      }

      if ($$0 != null) {
         $$0.a(true);
      }

      this.a = $$0;
   }
}
