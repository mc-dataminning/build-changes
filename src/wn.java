import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record wn(wu a) implements wb<wl> {
   private static final int b = 32767;
   private static final Map<afw, tl.a<? extends wu>> c = ImmutableMap.builder().put(wt.a, wt::new).build();

   public wn(tl $$0) {
      this(a($$0.t(), $$0));
   }

   private static wu a(afw $$0, tl $$1) {
      tl.a<? extends wu> $$2 = c.get($$0);
      return (wu)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static wv b(afw $$0, tl $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 32767) {
         $$1.j($$2);
         return new wv($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
      }
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(wl $$0) {
      $$0.a(this);
   }
}
