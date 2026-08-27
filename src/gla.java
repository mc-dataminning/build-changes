import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gla implements asc {
   public static final gla.a<cpd> a = new gla.a<>();
   public static final gla.a<cpd> b = new gla.a<>();
   public static final gla.a<fjd> c = new gla.a<>();
   private final Map<gla.a<?>, gla.c<?>> d = new HashMap<>();

   @Override
   public void a(asb $$0) {
      for (gla.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gla.a<T> $$0, gla.b<T> $$1) {
      this.d.put($$0, new gla.c<>($$1));
   }

   private <T> gla.c<T> b(gla.a<T> $$0) {
      gla.c<T> $$1 = (gla.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gla.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> glb<T> a(gla.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gky<T>> {
   }

   static class c<T> {
      private final gla.b<T> a;
      gky<T> b = gky.b();

      c(gla.b<T> $$0) {
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
