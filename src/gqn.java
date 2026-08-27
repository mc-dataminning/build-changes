import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gqn implements atp {
   public static final gqn.a<csd> a = new gqn.a<>();
   public static final gqn.a<csd> b = new gqn.a<>();
   public static final gqn.a<fok> c = new gqn.a<>();
   private final Map<gqn.a<?>, gqn.c<?>> d = new HashMap<>();

   @Override
   public void a(ato $$0) {
      for (gqn.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gqn.a<T> $$0, gqn.b<T> $$1) {
      this.d.put($$0, new gqn.c<>($$1));
   }

   private <T> gqn.c<T> b(gqn.a<T> $$0) {
      gqn.c<T> $$1 = (gqn.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gqn.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gqo<T> a(gqn.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gql<T>> {
   }

   static class c<T> {
      private final gqn.b<T> a;
      gql<T> b = gql.b();

      c(gqn.b<T> $$0) {
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
