import javax.annotation.Nullable;

public record hjj(@Nullable avw a, float b) {
   public hjj(avw $$0) {
      this($$0, 1.0F);
   }

   public boolean a(hij $$0) {
      return this.a == null ? false : this.a.d() && !this.a.a().a().a().equals($$0.a());
   }
}
