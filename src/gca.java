import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gca implements anl {
   public static final gca.a<ciw> a = new gca.a<>();
   public static final gca.a<ciw> b = new gca.a<>();
   public static final gca.a<fbl> c = new gca.a<>();
   private final Map<gca.a<?>, gca.c<?>> d = new HashMap<>();

   @Override
   public void a(ank $$0) {
      for (gca.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gca.a<T> $$0, gca.b<T> $$1) {
      this.d.put($$0, new gca.c<>($$1));
   }

   private <T> gca.c<T> b(gca.a<T> $$0) {
      gca.c<T> $$1 = (gca.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gca.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gcb<T> a(gca.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gby<T>> {
   }

   static class c<T> {
      private final gca.b<T> a;
      gby<T> b = gby.b();

      c(gca.b<T> $$0) {
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
