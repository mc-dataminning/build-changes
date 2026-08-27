import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record xa(xh a) implements wo<wy> {
   private static final int b = 32767;
   private static final Map<agm, ty.a<? extends xh>> c = ImmutableMap.builder().put(xg.a, xg::new).build();

   public xa(ty $$0) {
      this(a($$0.t(), $$0));
   }

   private static xh a(agm $$0, ty $$1) {
      ty.a<? extends xh> $$2 = c.get($$0);
      return (xh)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static xi b(agm $$0, ty $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 32767) {
         $$1.j($$2);
         return new xi($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
      }
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }
}
