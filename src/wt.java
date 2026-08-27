import java.util.Map;

public class wt implements wk<wn> {
   private final Map<agf<? extends io<?>>, aru.a> a;

   public wt(Map<agf<? extends io<?>>, aru.a> $$0) {
      this.a = $$0;
   }

   public wt(tu $$0) {
      this.a = $$0.a(tu::u, aru.a::b);
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a, tu::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(wn $$0) {
      $$0.a(this);
   }

   public Map<agf<? extends io<?>>, aru.a> a() {
      return this.a;
   }
}
