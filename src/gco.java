import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gco implements ann {
   public static final gco.a<cix> a = new gco.a<>();
   public static final gco.a<cix> b = new gco.a<>();
   public static final gco.a<fbq> c = new gco.a<>();
   private final Map<gco.a<?>, gco.c<?>> d = new HashMap<>();

   @Override
   public void a(anm $$0) {
      for (gco.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gco.a<T> $$0, gco.b<T> $$1) {
      this.d.put($$0, new gco.c<>($$1));
   }

   private <T> gco.c<T> b(gco.a<T> $$0) {
      gco.c<T> $$1 = (gco.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gco.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gcp<T> a(gco.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gcm<T>> {
   }

   static class c<T> {
      private final gco.b<T> a;
      gcm<T> b = gcm.b();

      c(gco.b<T> $$0) {
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
