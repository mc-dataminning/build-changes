import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record xt(yb a) implements xg<xr> {
   private static final int b = 32767;
   private static final Map<ahh, uj.a<? extends yb>> c = ImmutableMap.builder().put(xz.a, xz::new).build();

   public xt(uj $$0) {
      this(a($$0.t(), $$0));
   }

   private static yb a(ahh $$0, uj $$1) {
      uj.a<? extends yb> $$2 = c.get($$0);
      return (yb)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static yc b(ahh $$0, uj $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 32767) {
         $$1.j($$2);
         return new yc($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
      }
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(xr $$0) {
      $$0.a(this);
   }
}
