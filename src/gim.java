import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gim implements aqj {
   public static final gim.a<cmy> a = new gim.a<>();
   public static final gim.a<cmy> b = new gim.a<>();
   public static final gim.a<fgt> c = new gim.a<>();
   private final Map<gim.a<?>, gim.c<?>> d = new HashMap<>();

   @Override
   public void a(aqi $$0) {
      for (gim.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gim.a<T> $$0, gim.b<T> $$1) {
      this.d.put($$0, new gim.c<>($$1));
   }

   private <T> gim.c<T> b(gim.a<T> $$0) {
      gim.c<T> $$1 = (gim.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gim.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gin<T> a(gim.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gik<T>> {
   }

   static class c<T> {
      private final gim.b<T> a;
      gik<T> b = gik.b();

      c(gim.b<T> $$0) {
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
