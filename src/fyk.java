import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class fyk implements aky {
   public static final fyk.a<cfz> a = new fyk.a<>();
   public static final fyk.a<cfz> b = new fyk.a<>();
   public static final fyk.a<eyg> c = new fyk.a<>();
   private final Map<fyk.a<?>, fyk.c<?>> d = new HashMap<>();

   @Override
   public void a(akx $$0) {
      for (fyk.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(fyk.a<T> $$0, fyk.b<T> $$1) {
      this.d.put($$0, new fyk.c<>($$1));
   }

   private <T> fyk.c<T> b(fyk.a<T> $$0) {
      fyk.c<T> $$1 = (fyk.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(fyk.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> fyl<T> a(fyk.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, fyi<T>> {
   }

   static class c<T> {
      private final fyk.b<T> a;
      fyi<T> b = fyi.b();

      c(fyk.b<T> $$0) {
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
