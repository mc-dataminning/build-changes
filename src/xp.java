import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record xp(xx a) implements xd<xn> {
   private static final int b = 32767;
   private static final Map<ahd, ug.a<? extends xx>> c = ImmutableMap.builder().put(xv.a, xv::new).build();

   public xp(ug $$0) {
      this(a($$0.t(), $$0));
   }

   private static xx a(ahd $$0, ug $$1) {
      ug.a<? extends xx> $$2 = c.get($$0);
      return (xx)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static xy b(ahd $$0, ug $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 32767) {
         $$1.j($$2);
         return new xy($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
      }
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(xn $$0) {
      $$0.a(this);
   }
}
