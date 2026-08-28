import javax.annotation.Nullable;

public record hlp(@Nullable awh a, float b) {
   public hlp(awh $$0) {
      this($$0, 1.0F);
   }

   public boolean a(hkp $$0) {
      return this.a == null ? false : this.a.d() && !this.a.a().a().a().equals($$0.a());
   }
}
