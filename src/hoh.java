import javax.annotation.Nullable;

public record hoh(@Nullable awk a, float b) {
   public hoh(awk $$0) {
      this($$0, 1.0F);
   }

   public boolean a(hnh $$0) {
      return this.a == null ? false : this.a.d() && !this.a.a().a().a().equals($$0.a());
   }
}
