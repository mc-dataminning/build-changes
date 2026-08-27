import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class ghz implements aqd {
   public static final ghz.a<cmr> a = new ghz.a<>();
   public static final ghz.a<cmr> b = new ghz.a<>();
   public static final ghz.a<fgl> c = new ghz.a<>();
   private final Map<ghz.a<?>, ghz.c<?>> d = new HashMap<>();

   @Override
   public void a(aqc $$0) {
      for (ghz.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(ghz.a<T> $$0, ghz.b<T> $$1) {
      this.d.put($$0, new ghz.c<>($$1));
   }

   private <T> ghz.c<T> b(ghz.a<T> $$0) {
      ghz.c<T> $$1 = (ghz.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(ghz.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gia<T> a(ghz.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, ghx<T>> {
   }

   static class c<T> {
      private final ghz.b<T> a;
      ghx<T> b = ghx.b();

      c(ghz.b<T> $$0) {
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
