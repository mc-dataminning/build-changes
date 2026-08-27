import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class guy implements aue {
   public static final guy.a<cuh> a = new guy.a<>();
   public static final guy.a<cuh> b = new guy.a<>();
   public static final guy.a<fsj> c = new guy.a<>();
   private final Map<guy.a<?>, guy.c<?>> d = new HashMap<>();

   @Override
   public void a(aud $$0) {
      for (guy.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(guy.a<T> $$0, guy.b<T> $$1) {
      this.d.put($$0, new guy.c<>($$1));
   }

   private <T> guy.c<T> b(guy.a<T> $$0) {
      guy.c<T> $$1 = (guy.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(guy.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> guz<T> a(guy.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, guw<T>> {
   }

   static class c<T> {
      private final guy.b<T> a;
      guw<T> b = guw.b();

      c(guy.b<T> $$0) {
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
