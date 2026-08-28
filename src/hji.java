import javax.annotation.Nullable;

public record hji(@Nullable avx a, float b) {
   public hji(avx $$0) {
      this($$0, 1.0F);
   }

   public boolean a(hii $$0) {
      return this.a == null ? false : this.a.d() && !this.a.a().a().a().equals($$0.a());
   }
}
