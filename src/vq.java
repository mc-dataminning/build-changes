import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record vq(vx a) implements ve<vo> {
   private static final int b = 32767;
   private static final Map<aez, so.a<? extends vx>> c = ImmutableMap.builder().put(vw.a, vw::new).build();

   public vq(so $$0) {
      this(a($$0.t(), $$0));
   }

   private static vx a(aez $$0, so $$1) {
      so.a<? extends vx> $$2 = c.get($$0);
      return (vx)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static vy b(aez $$0, so $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 32767) {
         $$1.j($$2);
         return new vy($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
      }
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(vo $$0) {
      $$0.a(this);
   }
}
