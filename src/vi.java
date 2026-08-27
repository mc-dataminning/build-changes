import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record vi(vp a) implements ux<vh> {
   private static final int b = 32767;
   private static final Map<aer, si.a<? extends vp>> c = ImmutableMap.builder().put(vo.a, vo::new).build();

   public vi(si $$0) {
      this(a($$0.s(), $$0));
   }

   private static vp a(aer $$0, si $$1) {
      si.a<? extends vp> $$2 = c.get($$0);
      return (vp)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static vq b(aer $$0, si $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 32767) {
         $$1.j($$2);
         return new vq($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
      }
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(vh $$0) {
      $$0.a(this);
   }
}
