import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record vr(vy a) implements vf<vp> {
   private static final int b = 32767;
   private static final Map<aey, sq.a<? extends vy>> c = ImmutableMap.builder().put(vx.a, vx::new).build();

   public vr(sq $$0) {
      this(a($$0.s(), $$0));
   }

   private static vy a(aey $$0, sq $$1) {
      sq.a<? extends vy> $$2 = c.get($$0);
      return (vy)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static vz b(aey $$0, sq $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 32767) {
         $$1.j($$2);
         return new vz($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
      }
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(vp $$0) {
      $$0.a(this);
   }
}
