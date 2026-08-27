import java.util.Map;

public class vj implements va<vd> {
   private final Map<aet<? extends ht<?>>, aqg.a> a;

   public vj(Map<aet<? extends ht<?>>, aqg.a> $$0) {
      this.a = $$0;
   }

   public vj(sl $$0) {
      this.a = $$0.a(sl::t, aqg.a::b);
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a, sl::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(vd $$0) {
      $$0.a(this);
   }

   public Map<aet<? extends ht<?>>, aqg.a> a() {
      return this.a;
   }
}
