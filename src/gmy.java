import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gmy implements asp {
   public static final gmy.a<cqk> a = new gmy.a<>();
   public static final gmy.a<cqk> b = new gmy.a<>();
   public static final gmy.a<fkx> c = new gmy.a<>();
   private final Map<gmy.a<?>, gmy.c<?>> d = new HashMap<>();

   @Override
   public void a(aso $$0) {
      for (gmy.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gmy.a<T> $$0, gmy.b<T> $$1) {
      this.d.put($$0, new gmy.c<>($$1));
   }

   private <T> gmy.c<T> b(gmy.a<T> $$0) {
      gmy.c<T> $$1 = (gmy.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gmy.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gmz<T> a(gmy.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gmw<T>> {
   }

   static class c<T> {
      private final gmy.b<T> a;
      gmw<T> b = gmw.b();

      c(gmy.b<T> $$0) {
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
