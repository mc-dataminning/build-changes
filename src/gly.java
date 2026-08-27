import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gly implements asg {
   public static final gly.a<cpq> a = new gly.a<>();
   public static final gly.a<cpq> b = new gly.a<>();
   public static final gly.a<fjz> c = new gly.a<>();
   private final Map<gly.a<?>, gly.c<?>> d = new HashMap<>();

   @Override
   public void a(asf $$0) {
      for (gly.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gly.a<T> $$0, gly.b<T> $$1) {
      this.d.put($$0, new gly.c<>($$1));
   }

   private <T> gly.c<T> b(gly.a<T> $$0) {
      gly.c<T> $$1 = (gly.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gly.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> glz<T> a(gly.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, glw<T>> {
   }

   static class c<T> {
      private final gly.b<T> a;
      glw<T> b = glw.b();

      c(gly.b<T> $$0) {
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
