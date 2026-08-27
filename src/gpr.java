import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gpr implements atf {
   public static final gpr.a<crs> a = new gpr.a<>();
   public static final gpr.a<crs> b = new gpr.a<>();
   public static final gpr.a<fno> c = new gpr.a<>();
   private final Map<gpr.a<?>, gpr.c<?>> d = new HashMap<>();

   @Override
   public void a(ate $$0) {
      for (gpr.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gpr.a<T> $$0, gpr.b<T> $$1) {
      this.d.put($$0, new gpr.c<>($$1));
   }

   private <T> gpr.c<T> b(gpr.a<T> $$0) {
      gpr.c<T> $$1 = (gpr.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gpr.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gps<T> a(gpr.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gpp<T>> {
   }

   static class c<T> {
      private final gpr.b<T> a;
      gpp<T> b = gpp.b();

      c(gpr.b<T> $$0) {
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
