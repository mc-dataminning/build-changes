import javax.annotation.Nullable;

public record hgd(@Nullable aws a, float b) {
   public hgd(aws $$0) {
      this($$0, 1.0F);
   }

   public boolean a(hfd $$0) {
      return this.a == null ? false : this.a.d() && !this.a.a().a().a().equals($$0.a());
   }
}
