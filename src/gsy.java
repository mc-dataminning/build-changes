import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gsy implements aup {
   public static final gsy.a<cuo> a = new gsy.a<>();
   public static final gsy.a<cuo> b = new gsy.a<>();
   public static final gsy.a<fqt> c = new gsy.a<>();
   private final Map<gsy.a<?>, gsy.c<?>> d = new HashMap<>();

   @Override
   public void a(auo $$0) {
      for (gsy.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gsy.a<T> $$0, gsy.b<T> $$1) {
      this.d.put($$0, new gsy.c<>($$1));
   }

   private <T> gsy.c<T> b(gsy.a<T> $$0) {
      gsy.c<T> $$1 = (gsy.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gsy.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gsz<T> a(gsy.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gsw<T>> {
   }

   static class c<T> {
      private final gsy.b<T> a;
      gsw<T> b = gsw.b();

      c(gsy.b<T> $$0) {
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
