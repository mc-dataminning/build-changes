import javax.annotation.Nullable;

public record hjp(@Nullable avx a, float b) {
   public hjp(avx $$0) {
      this($$0, 1.0F);
   }

   public boolean a(hip $$0) {
      return this.a == null ? false : this.a.d() && !this.a.a().a().a().equals($$0.a());
   }
}
