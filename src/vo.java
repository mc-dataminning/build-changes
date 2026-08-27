import java.util.Map;

public class vo implements vf<vi> {
   private final Map<aex<? extends ht<?>>, aqm.a> a;

   public vo(Map<aex<? extends ht<?>>, aqm.a> $$0) {
      this.a = $$0;
   }

   public vo(sq $$0) {
      this.a = $$0.a(sq::t, aqm.a::b);
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a, sq::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(vi $$0) {
      $$0.a(this);
   }

   public Map<aex<? extends ht<?>>, aqm.a> a() {
      return this.a;
   }
}
