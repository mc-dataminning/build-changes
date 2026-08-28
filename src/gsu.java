import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gsu implements aum {
   public static final gsu.a<cuk> a = new gsu.a<>();
   public static final gsu.a<cuk> b = new gsu.a<>();
   public static final gsu.a<fqp> c = new gsu.a<>();
   private final Map<gsu.a<?>, gsu.c<?>> d = new HashMap<>();

   @Override
   public void a(aul $$0) {
      for (gsu.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gsu.a<T> $$0, gsu.b<T> $$1) {
      this.d.put($$0, new gsu.c<>($$1));
   }

   private <T> gsu.c<T> b(gsu.a<T> $$0) {
      gsu.c<T> $$1 = (gsu.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gsu.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gsv<T> a(gsu.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gss<T>> {
   }

   static class c<T> {
      private final gsu.b<T> a;
      gss<T> b = gss.b();

      c(gsu.b<T> $$0) {
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
