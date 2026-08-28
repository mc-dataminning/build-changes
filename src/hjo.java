import javax.annotation.Nullable;

public record hjo(@Nullable avx a, float b) {
   public hjo(avx $$0) {
      this($$0, 1.0F);
   }

   public boolean a(hio $$0) {
      return this.a == null ? false : this.a.d() && !this.a.a().a().a().equals($$0.a());
   }
}
