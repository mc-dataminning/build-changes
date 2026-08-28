import javax.annotation.Nullable;

public record hpx(@Nullable awm a, float b) {
   public hpx(awm $$0) {
      this($$0, 1.0F);
   }

   public boolean a(hox $$0) {
      return this.a == null ? false : this.a.d() && !this.a.a().a().a().equals($$0.a());
   }
}
