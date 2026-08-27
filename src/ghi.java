import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class ghi implements apt {
   public static final ghi.a<cmh> a = new ghi.a<>();
   public static final ghi.a<cmh> b = new ghi.a<>();
   public static final ghi.a<ffu> c = new ghi.a<>();
   private final Map<ghi.a<?>, ghi.c<?>> d = new HashMap<>();

   @Override
   public void a(aps $$0) {
      for (ghi.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(ghi.a<T> $$0, ghi.b<T> $$1) {
      this.d.put($$0, new ghi.c<>($$1));
   }

   private <T> ghi.c<T> b(ghi.a<T> $$0) {
      ghi.c<T> $$1 = (ghi.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(ghi.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> ghj<T> a(ghi.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, ghg<T>> {
   }

   static class c<T> {
      private final ghi.b<T> a;
      ghg<T> b = ghg.b();

      c(ghi.b<T> $$0) {
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
