import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gsz implements auq {
   public static final gsz.a<cup> a = new gsz.a<>();
   public static final gsz.a<cup> b = new gsz.a<>();
   public static final gsz.a<fqu> c = new gsz.a<>();
   private final Map<gsz.a<?>, gsz.c<?>> d = new HashMap<>();

   @Override
   public void a(aup $$0) {
      for (gsz.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gsz.a<T> $$0, gsz.b<T> $$1) {
      this.d.put($$0, new gsz.c<>($$1));
   }

   private <T> gsz.c<T> b(gsz.a<T> $$0) {
      gsz.c<T> $$1 = (gsz.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gsz.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gta<T> a(gsz.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gsx<T>> {
   }

   static class c<T> {
      private final gsz.b<T> a;
      gsx<T> b = gsx.b();

      c(gsz.b<T> $$0) {
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
