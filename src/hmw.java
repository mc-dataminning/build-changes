import javax.annotation.Nullable;

public record hmw(@Nullable awi a, float b) {
   public hmw(awi $$0) {
      this($$0, 1.0F);
   }

   public boolean a(hlw $$0) {
      return this.a == null ? false : this.a.d() && !this.a.a().a().a().equals($$0.a());
   }
}
