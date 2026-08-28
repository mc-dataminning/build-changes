import java.util.Map;

public class zt implements zc<zi> {
   public static final yt<vr, zt> a = zc.a(zt::a, zt::new);
   private final Map<alc<? extends kf<?>>, axr.a> b;

   public zt(Map<alc<? extends kf<?>>, axr.a> $$0) {
      this.b = $$0;
   }

   private zt(vr $$0) {
      this.b = $$0.a(vr::r, axr.a::b);
   }

   private void a(vr $$0) {
      $$0.a(this.b, vr::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public ze<zt> a() {
      return zu.k;
   }

   public void a(zi $$0) {
      $$0.a(this);
   }

   public Map<alc<? extends kf<?>>, axr.a> b() {
      return this.b;
   }
}
