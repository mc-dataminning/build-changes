import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record xg(xo a) implements wu<xe> {
   private static final int b = 32767;
   private static final Map<agt, ue.a<? extends xo>> c = ImmutableMap.builder().put(xm.a, xm::new).build();

   public xg(ue $$0) {
      this(a($$0.t(), $$0));
   }

   private static xo a(agt $$0, ue $$1) {
      ue.a<? extends xo> $$2 = c.get($$0);
      return (xo)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static xp b(agt $$0, ue $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 32767) {
         $$1.j($$2);
         return new xp($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
      }
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(xe $$0) {
      $$0.a(this);
   }
}
