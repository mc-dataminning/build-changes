import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gtb implements auq {
   public static final gtb.a<cur> a = new gtb.a<>();
   public static final gtb.a<cur> b = new gtb.a<>();
   public static final gtb.a<fqw> c = new gtb.a<>();
   private final Map<gtb.a<?>, gtb.c<?>> d = new HashMap<>();

   @Override
   public void a(aup $$0) {
      for (gtb.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gtb.a<T> $$0, gtb.b<T> $$1) {
      this.d.put($$0, new gtb.c<>($$1));
   }

   private <T> gtb.c<T> b(gtb.a<T> $$0) {
      gtb.c<T> $$1 = (gtb.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gtb.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gtc<T> a(gtb.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gsz<T>> {
   }

   static class c<T> {
      private final gtb.b<T> a;
      gsz<T> b = gsz.b();

      c(gtb.b<T> $$0) {
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
