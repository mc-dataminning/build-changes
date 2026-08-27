import java.util.Map;

public class xd implements wu<wx> {
   private final Map<ags<? extends ir<?>>, asj.a> a;

   public xd(Map<ags<? extends ir<?>>, asj.a> $$0) {
      this.a = $$0;
   }

   public xd(ue $$0) {
      this.a = $$0.a(ue::u, asj.a::b);
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a, ue::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public Map<ags<? extends ir<?>>, asj.a> a() {
      return this.a;
   }
}
