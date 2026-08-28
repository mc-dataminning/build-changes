import javax.annotation.Nullable;

public record hko(@Nullable avx a, float b) {
   public hko(avx $$0) {
      this($$0, 1.0F);
   }

   public boolean a(hjo $$0) {
      return this.a == null ? false : this.a.d() && !this.a.a().a().a().equals($$0.a());
   }
}
