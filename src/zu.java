import java.util.Map;

public class zu implements zd<zj> {
   public static final yu<vs, zu> a = zd.a(zu::a, zu::new);
   private final Map<ald<? extends jr<?>>, axr.a> b;

   public zu(Map<ald<? extends jr<?>>, axr.a> $$0) {
      this.b = $$0;
   }

   private zu(vs $$0) {
      this.b = $$0.a(vs::r, axr.a::b);
   }

   private void a(vs $$0) {
      $$0.a(this.b, vs::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zf<zu> a() {
      return zv.k;
   }

   public void a(zj $$0) {
      $$0.a(this);
   }

   public Map<ald<? extends jr<?>>, axr.a> b() {
      return this.b;
   }
}
