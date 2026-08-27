import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gcf implements ann {
   public static final gcf.a<ciy> a = new gcf.a<>();
   public static final gcf.a<ciy> b = new gcf.a<>();
   public static final gcf.a<fbp> c = new gcf.a<>();
   private final Map<gcf.a<?>, gcf.c<?>> d = new HashMap<>();

   @Override
   public void a(anm $$0) {
      for (gcf.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gcf.a<T> $$0, gcf.b<T> $$1) {
      this.d.put($$0, new gcf.c<>($$1));
   }

   private <T> gcf.c<T> b(gcf.a<T> $$0) {
      gcf.c<T> $$1 = (gcf.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gcf.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gcg<T> a(gcf.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gcd<T>> {
   }

   static class c<T> {
      private final gcf.b<T> a;
      gcd<T> b = gcd.b();

      c(gcf.b<T> $$0) {
         this.a = $$0;
      }

      void a(List<T> $$0) {
         this.b = this.a.apply($$0);
         this.b.a();
      }

      void a() {
         this.b.a();
      }
   }
}
