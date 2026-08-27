import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gqy implements ats {
   public static final gqy.a<csz> a = new gqy.a<>();
   public static final gqy.a<csz> b = new gqy.a<>();
   public static final gqy.a<fov> c = new gqy.a<>();
   private final Map<gqy.a<?>, gqy.c<?>> d = new HashMap<>();

   @Override
   public void a(atr $$0) {
      for (gqy.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gqy.a<T> $$0, gqy.b<T> $$1) {
      this.d.put($$0, new gqy.c<>($$1));
   }

   private <T> gqy.c<T> b(gqy.a<T> $$0) {
      gqy.c<T> $$1 = (gqy.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gqy.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gqz<T> a(gqy.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gqw<T>> {
   }

   static class c<T> {
      private final gqy.b<T> a;
      gqw<T> b = gqw.b();

      c(gqy.b<T> $$0) {
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
