import com.google.common.collect.Maps;
import java.util.Map;

public class fws implements fwq.a {
   private static final float a = 0.02F;
   private final Map<hx, fws.a> b = Maps.newHashMap();

   public void a(hx $$0, int $$1, String $$2, int $$3) {
      this.b.put($$0, new fws.a($$1, $$2, ac.b() + (long)$$3));
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(epz $$0, ftf $$1, double $$2, double $$3, double $$4) {
      long $$5 = ac.b();
      this.b.entrySet().removeIf($$1x -> $$5 > ((fws.a)$$1x.getValue()).c);
      this.b.forEach(($$2x, $$3x) -> this.a($$0, $$1, $$2x, $$3x));
   }

   private void a(epz $$0, ftf $$1, hx $$2, fws.a $$3) {
      fwq.a($$0, $$1, $$2, 0.02F, $$3.a(), $$3.b(), $$3.c(), $$3.d() * 0.75F);
      if (!$$3.b.isEmpty()) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v() + 1.2;
         double $$6 = (double)$$2.w() + 0.5;
         fwq.a($$0, $$1, $$3.b, $$4, $$5, $$6, -1, 0.01F, true, 0.0F, true);
      }
   }

   static class a {
      public int a;
      public String b;
      public long c;

      public a(int $$0, String $$1, long $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public float a() {
         return (float)(this.a >> 16 & 0xFF) / 255.0F;
      }

      public float b() {
         return (float)(this.a >> 8 & 0xFF) / 255.0F;
      }

      public float c() {
         return (float)(this.a & 0xFF) / 255.0F;
      }

      public float d() {
         return (float)(this.a >> 24 & 0xFF) / 255.0F;
      }
   }
}
