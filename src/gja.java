import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gja implements aqk {
   public static final gja.a<cng> a = new gja.a<>();
   public static final gja.a<cng> b = new gja.a<>();
   public static final gja.a<fhe> c = new gja.a<>();
   private final Map<gja.a<?>, gja.c<?>> d = new HashMap<>();

   @Override
   public void a(aqj $$0) {
      for (gja.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gja.a<T> $$0, gja.b<T> $$1) {
      this.d.put($$0, new gja.c<>($$1));
   }

   private <T> gja.c<T> b(gja.a<T> $$0) {
      gja.c<T> $$1 = (gja.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gja.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gjb<T> a(gja.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, giy<T>> {
   }

   static class c<T> {
      private final gja.b<T> a;
      giy<T> b = giy.b();

      c(gja.b<T> $$0) {
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
