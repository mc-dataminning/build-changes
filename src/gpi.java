import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gpi implements atd {
   public static final gpi.a<crj> a = new gpi.a<>();
   public static final gpi.a<crj> b = new gpi.a<>();
   public static final gpi.a<fnf> c = new gpi.a<>();
   private final Map<gpi.a<?>, gpi.c<?>> d = new HashMap<>();

   @Override
   public void a(atc $$0) {
      for (gpi.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gpi.a<T> $$0, gpi.b<T> $$1) {
      this.d.put($$0, new gpi.c<>($$1));
   }

   private <T> gpi.c<T> b(gpi.a<T> $$0) {
      gpi.c<T> $$1 = (gpi.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gpi.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gpj<T> a(gpi.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gpg<T>> {
   }

   static class c<T> {
      private final gpi.b<T> a;
      gpg<T> b = gpg.b();

      c(gpi.b<T> $$0) {
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
