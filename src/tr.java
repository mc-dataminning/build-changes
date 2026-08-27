import javax.annotation.Nullable;

@FunctionalInterface
public interface tr {
   tr a = $$0 -> !$$0.h();
   tr b = $$0 -> false;

   boolean updateAndValidate(tl var1);

   public static class a implements tr {
      private final apj c;
      @Nullable
      private tl d;
      private boolean e = true;

      public a(apj $$0) {
         this.c = $$0;
      }

      private boolean a(tl $$0) {
         return $$0.equals(this.d) ? true : this.d == null || $$0.j().a(this.d.j());
      }

      @Override
      public boolean updateAndValidate(tl $$0) {
         this.e = this.e && $$0.a(this.c) && this.a($$0);
         if (!this.e) {
            return false;
         } else {
            this.d = $$0;
            return true;
         }
      }
   }
}
