import com.google.common.collect.ImmutableMap;
import java.util.Map;

public record vl(vs a) implements va<vk> {
   private static final int b = 32767;
   private static final Map<aeu, sl.a<? extends vs>> c = ImmutableMap.builder().put(vr.a, vr::new).build();

   public vl(sl $$0) {
      this(a($$0.s(), $$0));
   }

   private static vs a(aeu $$0, sl $$1) {
      sl.a<? extends vs> $$2 = c.get($$0);
      return (vs)($$2 != null ? $$2.apply($$1) : b($$0, $$1));
   }

   private static vt b(aeu $$0, sl $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 32767) {
         $$1.j($$2);
         return new vt($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
      }
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a.a());
      this.a.a($$0);
   }

   public void a(vk $$0) {
      $$0.a(this);
   }
}
