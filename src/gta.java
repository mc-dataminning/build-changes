import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gta implements auq {
   public static final gta.a<cuq> a = new gta.a<>();
   public static final gta.a<cuq> b = new gta.a<>();
   public static final gta.a<fqv> c = new gta.a<>();
   private final Map<gta.a<?>, gta.c<?>> d = new HashMap<>();

   @Override
   public void a(aup $$0) {
      for (gta.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gta.a<T> $$0, gta.b<T> $$1) {
      this.d.put($$0, new gta.c<>($$1));
   }

   private <T> gta.c<T> b(gta.a<T> $$0) {
      gta.c<T> $$1 = (gta.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gta.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gtb<T> a(gta.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gsy<T>> {
   }

   static class c<T> {
      private final gta.b<T> a;
      gsy<T> b = gsy.b();

      c(gta.b<T> $$0) {
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
