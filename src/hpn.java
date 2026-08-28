import javax.annotation.Nullable;

public record hpn(@Nullable awv a, float b) {
   public hpn(awv $$0) {
      this($$0, 1.0F);
   }

   public boolean a(hon $$0) {
      return this.a == null ? false : this.a.d() && !this.a.a().a().a().equals($$0.a());
   }
}
