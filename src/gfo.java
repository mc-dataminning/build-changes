import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gfo implements api {
   public static final gfo.a<clj> a = new gfo.a<>();
   public static final gfo.a<clj> b = new gfo.a<>();
   public static final gfo.a<fem> c = new gfo.a<>();
   private final Map<gfo.a<?>, gfo.c<?>> d = new HashMap<>();

   @Override
   public void a(aph $$0) {
      for (gfo.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gfo.a<T> $$0, gfo.b<T> $$1) {
      this.d.put($$0, new gfo.c<>($$1));
   }

   private <T> gfo.c<T> b(gfo.a<T> $$0) {
      gfo.c<T> $$1 = (gfo.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gfo.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gfp<T> a(gfo.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gfm<T>> {
   }

   static class c<T> {
      private final gfo.b<T> a;
      gfm<T> b = gfm.b();

      c(gfo.b<T> $$0) {
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
