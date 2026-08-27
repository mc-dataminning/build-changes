import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record ww(xd a) implements wk<wu> {
   private static final int b = 32767;
   private static final Map<agi, tu.a<? extends xd>> c = ImmutableMap.builder().put(xc.a, xc::new).build();

   public ww(tu $$0) {
      this(a($$0.t(), $$0));
   }

   private static xd a(agi $$0, tu $$1) {
      tu.a<? extends xd> $$2 = c.get($$0);
      return (xd)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static xe b(agi $$0, tu $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 32767) {
         $$1.j($$2);
         return new xe($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
      }
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(wu $$0) {
      $$0.a(this);
   }
}
