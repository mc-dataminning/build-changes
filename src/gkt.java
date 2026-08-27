import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gkt implements asb {
   public static final gkt.a<coz> a = new gkt.a<>();
   public static final gkt.a<coz> b = new gkt.a<>();
   public static final gkt.a<fiw> c = new gkt.a<>();
   private final Map<gkt.a<?>, gkt.c<?>> d = new HashMap<>();

   @Override
   public void a(asa $$0) {
      for (gkt.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gkt.a<T> $$0, gkt.b<T> $$1) {
      this.d.put($$0, new gkt.c<>($$1));
   }

   private <T> gkt.c<T> b(gkt.a<T> $$0) {
      gkt.c<T> $$1 = (gkt.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gkt.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gku<T> a(gkt.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gkr<T>> {
   }

   static class c<T> {
      private final gkt.b<T> a;
      gkr<T> b = gkr.b();

      c(gkt.b<T> $$0) {
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
