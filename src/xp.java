import java.util.Map;

public class xp implements xf<xi> {
   private final Map<ahf<? extends it<?>>, asz.a> a;

   public xp(Map<ahf<? extends it<?>>, asz.a> $$0) {
      this.a = $$0;
   }

   public xp(ui $$0) {
      this.a = $$0.a(ui::u, asz.a::b);
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a, ui::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(xi $$0) {
      $$0.a(this);
   }

   public Map<ahf<? extends it<?>>, asz.a> a() {
      return this.a;
   }
}
