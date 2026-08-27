import java.util.Map;
import java.util.Map.Entry;

public class gbx {
   private Map<dpy, goo> a = Map.of();
   private final gou b;

   public gbx(gou $$0) {
      this.b = $$0;
   }

   public gmo a(dpy $$0) {
      return this.b($$0).e();
   }

   public goo b(dpy $$0) {
      goo $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gou a() {
      return this.b;
   }

   public void a(Map<dpy, goo> $$0) {
      this.a = $$0;
   }

   public static gov c(dpy $$0) {
      return a(lc.e.b($$0.b()), $$0);
   }

   public static gov a(akf $$0, dpy $$1) {
      return new gov($$0, b($$1.C()));
   }

   public static String b(Map<drb<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<drb<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         drb<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(drb<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
