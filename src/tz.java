import javax.annotation.Nullable;

@FunctionalInterface
public interface tz {
   tz a = $$0 -> !$$0.h();
   tz b = $$0 -> false;

   boolean updateAndValidate(tt var1);

   public static class a implements tz {
      private final arx c;
      @Nullable
      private tt d;
      private boolean e = true;

      public a(arx $$0) {
         this.c = $$0;
      }

      private boolean a(tt $$0) {
         return $$0.equals(this.d) ? true : this.d == null || $$0.j().a(this.d.j());
      }

      @Override
      public boolean updateAndValidate(tt $$0) {
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
