import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record vh(vo a) implements uw<vg> {
   private static final int b = 32767;
   private static final Map<aep, sh.a<? extends vo>> c = ImmutableMap.builder().put(vn.a, vn::new).build();

   public vh(sh $$0) {
      this(a($$0.s(), $$0));
   }

   private static vo a(aep $$0, sh $$1) {
      sh.a<? extends vo> $$2 = c.get($$0);
      return (vo)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static vp b(aep $$0, sh $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 32767) {
         $$1.j($$2);
         return new vp($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
      }
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(vg $$0) {
      $$0.a(this);
   }
}
