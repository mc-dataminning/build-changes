import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record vp(vw a) implements vd<vn> {
   private static final int b = 32767;
   private static final Map<aew, so.a<? extends vw>> c = ImmutableMap.builder().put(vv.a, vv::new).build();

   public vp(so $$0) {
      this(a($$0.s(), $$0));
   }

   private static vw a(aew $$0, so $$1) {
      so.a<? extends vw> $$2 = c.get($$0);
      return (vw)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static vx b(aew $$0, so $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 32767) {
         $$1.j($$2);
         return new vx($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
      }
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(vn $$0) {
      $$0.a(this);
   }
}
