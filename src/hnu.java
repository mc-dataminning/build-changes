import javax.annotation.Nullable;

public record hnu(@Nullable awk a, float b) {
   public hnu(awk $$0) {
      this($$0, 1.0F);
   }

   public boolean a(hmu $$0) {
      return this.a == null ? false : this.a.d() && !this.a.a().a().a().equals($$0.a());
   }
}
