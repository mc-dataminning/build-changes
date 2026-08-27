import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gft implements apm {
   public static final gft.a<clo> a = new gft.a<>();
   public static final gft.a<clo> b = new gft.a<>();
   public static final gft.a<fer> c = new gft.a<>();
   private final Map<gft.a<?>, gft.c<?>> d = new HashMap<>();

   @Override
   public void a(apl $$0) {
      for (gft.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gft.a<T> $$0, gft.b<T> $$1) {
      this.d.put($$0, new gft.c<>($$1));
   }

   private <T> gft.c<T> b(gft.a<T> $$0) {
      gft.c<T> $$1 = (gft.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gft.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gfu<T> a(gft.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gfr<T>> {
   }

   static class c<T> {
      private final gft.b<T> a;
      gfr<T> b = gfr.b();

      c(gft.b<T> $$0) {
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
