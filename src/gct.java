import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gct implements anq {
   public static final gct.a<cja> a = new gct.a<>();
   public static final gct.a<cja> b = new gct.a<>();
   public static final gct.a<fbv> c = new gct.a<>();
   private final Map<gct.a<?>, gct.c<?>> d = new HashMap<>();

   @Override
   public void a(anp $$0) {
      for (gct.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gct.a<T> $$0, gct.b<T> $$1) {
      this.d.put($$0, new gct.c<>($$1));
   }

   private <T> gct.c<T> b(gct.a<T> $$0) {
      gct.c<T> $$1 = (gct.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gct.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gcu<T> a(gct.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gcr<T>> {
   }

   static class c<T> {
      private final gct.b<T> a;
      gcr<T> b = gcr.b();

      c(gct.b<T> $$0) {
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
