import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class grv implements aty {
   public static final grv.a<ctq> a = new grv.a<>();
   public static final grv.a<ctq> b = new grv.a<>();
   public static final grv.a<fpq> c = new grv.a<>();
   private final Map<grv.a<?>, grv.c<?>> d = new HashMap<>();

   @Override
   public void a(atx $$0) {
      for (grv.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(grv.a<T> $$0, grv.b<T> $$1) {
      this.d.put($$0, new grv.c<>($$1));
   }

   private <T> grv.c<T> b(grv.a<T> $$0) {
      grv.c<T> $$1 = (grv.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(grv.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> grw<T> a(grv.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, grt<T>> {
   }

   static class c<T> {
      private final grv.b<T> a;
      grt<T> b = grt.b();

      c(grv.b<T> $$0) {
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
