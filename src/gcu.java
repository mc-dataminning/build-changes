import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gcu implements anx {
   public static final gcu.a<cjl> a = new gcu.a<>();
   public static final gcu.a<cjl> b = new gcu.a<>();
   public static final gcu.a<fbv> c = new gcu.a<>();
   private final Map<gcu.a<?>, gcu.c<?>> d = new HashMap<>();

   @Override
   public void a(anw $$0) {
      for (gcu.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gcu.a<T> $$0, gcu.b<T> $$1) {
      this.d.put($$0, new gcu.c<>($$1));
   }

   private <T> gcu.c<T> b(gcu.a<T> $$0) {
      gcu.c<T> $$1 = (gcu.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gcu.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gcv<T> a(gcu.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gcs<T>> {
   }

   static class c<T> {
      private final gcu.b<T> a;
      gcs<T> b = gcs.b();

      c(gcu.b<T> $$0) {
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
