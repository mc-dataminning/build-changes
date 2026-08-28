import javax.annotation.Nullable;

public record hoo(@Nullable awk a, float b) {
   public hoo(awk $$0) {
      this($$0, 1.0F);
   }

   public boolean a(hno $$0) {
      return this.a == null ? false : this.a.d() && !this.a.a().a().a().equals($$0.a());
   }
}
