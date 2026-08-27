import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record xs(ya a) implements xf<xq> {
   private static final int b = 32767;
   private static final Map<ahg, ui.a<? extends ya>> c = ImmutableMap.builder().put(xy.a, xy::new).build();

   public xs(ui $$0) {
      this(a($$0.t(), $$0));
   }

   private static ya a(ahg $$0, ui $$1) {
      ui.a<? extends ya> $$2 = c.get($$0);
      return (ya)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static yb b(ahg $$0, ui $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 32767) {
         $$1.j($$2);
         return new yb($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
      }
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(xq $$0) {
      $$0.a(this);
   }
}
