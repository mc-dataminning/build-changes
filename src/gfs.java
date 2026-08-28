import java.util.Map;
import java.util.Map.Entry;

public class gfs {
   private Map<dtc, gsm> a = Map.of();
   private final gst b;

   public gfs(gst $$0) {
      this.b = $$0;
   }

   public gql a(dtc $$0) {
      return this.b($$0).e();
   }

   public gsm b(dtc $$0) {
      gsm $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gst a() {
      return this.b;
   }

   public void a(Map<dtc, gsm> $$0) {
      this.a = $$0;
   }

   public static gsu c(dtc $$0) {
      return a(lt.e.b($$0.b()), $$0);
   }

   public static gsu a(akr $$0, dtc $$1) {
      return new gsu($$0, b($$1.C()));
   }

   public static String b(Map<duf<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<duf<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         duf<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(duf<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
